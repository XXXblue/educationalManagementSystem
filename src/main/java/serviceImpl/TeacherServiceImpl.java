package serviceImpl;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.CannedAccessControlList;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import othermapper.MyStudentCourseInfoMapper;
import othermapper.MyTeacherMapper;
import po.*;
import poView.*;
import service.TeacherService;
import util.*;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1615:56
 * @Description:
 * @Modified By:
 */
@Service
public class TeacherServiceImpl implements TeacherService {
//    静态加盐加密处理
String salt = "be5e0323a9195ade5f56695ed9f2eb6b036f3e6417115d0cbe2fb9d74d8740406838dc84f152014b39a2414fb3530a40bc028a9e87642bd03cf5c36a1f70801e";
    @Autowired
    private TeacherinfoMapper teacherinfoMapper;
    @Autowired
    private MyTeacherMapper myTeacherMapper;
    @Autowired
    private StudentcourseinfoMapper studentcourseinfoMapper;
    @Autowired
    private DeptinfoMapper deptinfoMapper;
    @Autowired
    private OSSClient ossClient;
    @Autowired
    private ApplygradeMapper applygradeMapper;
    @Autowired
    private CourseinfoMapper courseinfoMapper;
    public MyResult addTeacherInfo(Teacherinfo teacherinfo) {
        MyResult myResult=new MyResult();
        if(checkTeacherInfo(teacherinfo)){
            myResult.setMsg("提交成功");
            myResult.setStatus(200);
        }else {
            myResult.setStatus(400);
            myResult.setMsg("教师编号重复出错");
            return myResult;
        }
//        加密处理
        PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
        String encode = encoderMd5.encode(teacherinfo.getTeacherpassword());
        teacherinfo.setTeacherpassword(encode);
        teacherinfo.setTeacherrole("teacher");
        teacherinfoMapper.insert(teacherinfo);
        return myResult;
    }

    public boolean checkTeacherInfo(Teacherinfo teacherinfo) {
      Teacherinfo teacherinfo1 =  teacherinfoMapper.selectByPrimaryKey(teacherinfo.getTeachernum());
      if(teacherinfo1!=null){
          return false;
      }
        return true;
    }

    public FormResult listAllTeacherInfo(int page, int limit) {
        TeacherinfoExample teacherinfoExample=new TeacherinfoExample();
        TeacherinfoExample.Criteria criteria=teacherinfoExample.createCriteria();
        PageHelper.startPage(page,limit);
        List<Teacherinfo>list=teacherinfoMapper.selectByExample(teacherinfoExample);
        List<TeacherView>listview=new ArrayList<TeacherView>();
        for (int i = 0; i < list.size(); i++) {
            TeacherView teacherView=new TeacherView();
            BeanUtils.copyProperties(list.get(i),teacherView);
            teacherView.setDeptname(deptinfoMapper.selectByPrimaryKey(list.get(i).getDeptnum()).getDeptname());
            listview.add(teacherView);
        }
        PageInfo<Teacherinfo> pageInfo = new PageInfo<Teacherinfo>(list);
        FormResult formResult=new FormResult();
        formResult.setCode(0);
        formResult.setCount(pageInfo.getTotal());
        formResult.setData(listview);
        formResult.setMsg("");
        return formResult;
    }

    public MyResult updateTeacherInfo(Teacherinfo teacherinfo) {
        MyResult myResult=new MyResult();
        try{
            PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
            String encode = encoderMd5.encode(teacherinfo.getTeacherpassword());
            teacherinfo.setTeacherpassword(encode);
            teacherinfoMapper.updateByPrimaryKey(teacherinfo);
            myResult.setMsg("修改成功");
            myResult.setStatus(200);
            return  myResult;
        }catch(Exception e){
            myResult.setStatus(400);
            myResult.setMsg("修改出错");
            return myResult;
        }

    }

    public MyResult delTeacherInfo(String[] nums) {
        MyResult myResult=new MyResult();
        try{
            for (int i = 0; i < nums.length; i++) {
                teacherinfoMapper.deleteByPrimaryKey(nums[i]);
            }
            myResult.setMsg("修改成功");
            myResult.setStatus(200);
            return myResult;
        }catch(Exception e){
            return  myResult;
        }
    }

    public MyResult login(String username, String password, HttpSession session) {
        MyResult myResult=new MyResult();
        TeacherinfoExample teacherinfoExample=new TeacherinfoExample();
        TeacherinfoExample.Criteria criteria=teacherinfoExample.createCriteria();
        criteria.andTeachernumEqualTo(username);
        List<Teacherinfo>list=teacherinfoMapper.selectByExample(teacherinfoExample);
        if(list==null||list.size()==0){
            myResult.setStatus(1);
            return myResult;
        }
        PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
        String encode = encoderMd5.encode(password);
        criteria.andTeacherpasswordEqualTo(encode);
        list=teacherinfoMapper.selectByExample(teacherinfoExample);
        if(list==null||list.size()==0){
            myResult.setStatus(2);
            return myResult;
        }
        List<Rolepermission> permissionlist=myTeacherMapper.selPermissionByTeacherNum(list.get(0).getTeachernum());
        ActiveRole activerole=new ActiveRole();
        activerole.setUsername(list.get(0).getTeachername());
        activerole.setRole(list.get(0).getTeacherrole());
        activerole.setList(permissionlist);
        activerole.setUsernum(list.get(0).getTeachernum());
        activerole.setPic(list.get(0).getTeacherpic());
        session.setAttribute("activerole",activerole);
        myResult.setStatus(3);
        return myResult;
    }

    public FormResult teacherCourseInfoTable(int page, int limit, HttpSession httpSession) {
        FormResult formResult=new FormResult();
        ActiveRole activeRole= (ActiveRole) httpSession.getAttribute("activerole");
       List<Courseinfo> list= myTeacherMapper.teacherCourseInfoTable(activeRole.getUsernum(),(page-1)*limit,limit);
        int total=myTeacherMapper.teacherCourseInfoTotal(activeRole.getUsernum());
       if(list==null||list.size()==0){
           formResult.setCode(0);
           formResult.setCount((long) 0);
           formResult.setData(null);
           formResult.setMsg("无数据");
           return  formResult;
       }
        formResult.setCode(0);
        formResult.setCount((long) total);
        formResult.setData(list);
        formResult.setMsg("");
        return  formResult;
    }

    public FormResult courseStudentInfoTable(String courseNum,int page, int limit) {
        List<StudentInfoOfCourseView>list=myTeacherMapper.teacherCourseListStudentInfo(courseNum,(page-1)*limit,limit);
        FormResult formResult=new FormResult();
        int total=myTeacherMapper.teacherCourseListStudentInfoTotal(courseNum);
        if(list==null||list.size()==0){
            formResult.setCode(0);
            formResult.setCount((long) 0);
            formResult.setData(null);
            formResult.setMsg("无数据");
            return  formResult;
        }
        formResult.setCode(0);
        formResult.setCount((long) total);
        formResult.setData(list);
        formResult.setMsg("");
        return formResult;
    }

    public MyResult editStudentGrade(Integer grade, Integer stuCourseID) {
        Studentcourseinfo studentcourseinfo=studentcourseinfoMapper.selectByPrimaryKey(stuCourseID);
        studentcourseinfo.setGrade(grade);
        studentcourseinfo.setUpdatetime(new Date());
        studentcourseinfoMapper.updateByPrimaryKey(studentcourseinfo);
        MyResult myResult=new MyResult();
        myResult.setStatus(1);
        myResult.setMsg("修改成功");
        return myResult;
    }

    public Teacherinfo teacherInfoShowForSelf(HttpSession session) {
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
        Teacherinfo teacherinfo=teacherinfoMapper.selectByPrimaryKey( activeRole.getUsernum());
        return teacherinfo;
    }

    public MyResult editTeacherInfoForSelf(HttpSession session,Teacherinfo teacherinfo) {
        MyResult myResult=new MyResult();
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
        teacherinfo.setTeachernum(activeRole.getUsernum());
        if(teacherinfo.getTeacherpassword()!=""){
            PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
            String encode = encoderMd5.encode(teacherinfo.getTeacherpassword());
            teacherinfo.setTeacherpassword(encode);
        }
        if(teacherinfo.getTeacherpic()!=""){
            teacherinfo.setTeacherpic("http://"+teacherinfo.getTeacherpic());
            String fileName=SubStringUtils.getSubStr(teacherinfo.getTeacherpic(),2);
//            删除原有的图片
            Teacherinfo teacherinfodelete=teacherinfoMapper.selectByPrimaryKey(teacherinfo.getTeachernum());
            if(teacherinfodelete.getTeacherpic()!=""&&teacherinfodelete.getTeacherpic()!=null){
                String delFileName=SubStringUtils.getSubStr(teacherinfodelete.getTeacherpic(),2);
                ossClient.deleteObject("xiaojianyu-file-server", delFileName);
            }
//            新增图片
            ossClient.setObjectAcl("xiaojianyu-file-server", fileName, CannedAccessControlList.PublicRead);
        }
        try{
            myTeacherMapper.updateTeacherInfoForSelf(teacherinfo);
            myResult.setStatus(1);
            myResult.setMsg("修改成功");
            return myResult;
        }catch(Exception e){
            myResult.setStatus(2);
            myResult.setMsg("修改出错");
            return myResult;
        }
    }

    public MyResult uploadTeacherPic(MultipartFile uploadFile) {
        String oldName=uploadFile.getOriginalFilename();
        String type=uploadFile.getContentType();
        String prefix=oldName.substring(oldName.lastIndexOf(".")+1);
        String newName=UUID.randomUUID().toString();
        MyResult myResult=new MyResult();
        try {
            InputStream inputStream=uploadFile.getInputStream();
            ossClient.putObject("xiaojianyu-file-server", "test/"+ newName+"."+prefix, inputStream);
//            ossClient.setObjectAcl("xiaojianyu-file-server", "test/ff.jpg", CannedAccessControlList.PublicRead);
            URL url = ossClient.generatePresignedUrl("xiaojianyu-file-server","test/"+ newName+"."+prefix,new Date());
            String path=url.getHost()+url.getPath();
            myResult.setMsg("上传到服务器成功");
            myResult.setStatus(1);
            myResult.setData(path);
            return myResult;
        } catch (IOException e) {
            e.printStackTrace();
            myResult.setMsg("上传出错");
            myResult.setStatus(2);
            myResult.setData(null);
            return myResult;
        }
    }
    public MyResult submitGrade(Courseinfo courseinfo){
        MyResult myResult=new MyResult();
        if(courseinfo.getCoursestatus().equals("0")){
            myResult.setStatus(1);
            return myResult;
        }
        if(courseinfo.getCoursestatus().equals("1")){
            myResult.setStatus(3);
            return myResult;
        }
//        更新到审批表
        Applygrade applygrade=new Applygrade();
        applygrade.setCoursenum(courseinfo.getCoursenum());
        applygrade.setCreatetime(new Date());
        applygrade.setUpdatetime(new Date());
        applygrade.setIfpass("0");
        applygradeMapper.insert(applygrade);
//        更新到课程表
        Courseinfo courseinfo1=new Courseinfo();
        courseinfo1.setIfgrade("1");
        courseinfo1.setCoursenum(courseinfo.getCoursenum());
        courseinfoMapper.updateByPrimaryKeySelective(courseinfo1);
        myResult.setStatus(2);
        return myResult;
    }
}
