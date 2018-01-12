package serviceImpl;

import QueryVo.StudentInfoQueryVo;
import com.alibaba.fastjson.JSON;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.CannedAccessControlList;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import mapper.MajorinfoMapper;
import mapper.StudentinfoMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import othermapper.*;
import po.*;

import poView.ActiveRole;
import poView.StuCourseTableView;
import poView.StudentInfoView;
import pojoCustom.CourseinfoCustom;
import service.StudentService;
import util.*;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/1316:43
 * @Description:
 * @Modified By:
 */
@Service
public class StudentServiceImpl implements StudentService{
//    静态加盐处理
    private  String salt = "be5e0323a9195ade5f56695ed9f2eb6b036f3e6417115d0cbe2fb9d74d8740406838dc84f152014b39a2414fb3530a40bc028a9e87642bd03cf5c36a1f70801e";
    @Autowired
    private StudentinfoMapper studentinfoMapper;
    @Autowired
    private MajorinfoMapper majorinfoMapper;
    @Autowired
    private MyStudentInfoMapper myStudentInfoMapper;
    @Autowired
    private MyStudentCourseInfoMapper myStudentCourseInfoMapper;
    @Autowired
    private  CourseinfoCustomMapper courseinfoCustomMapper;
    private static String accessKeyId= PropertyUtil.getProperty("accessKeyId");
    private static String endpoint= PropertyUtil.getProperty("endpoint");
    private static String accessKeySecret= PropertyUtil.getProperty("accessKeySecret");

    public MyResult addStudentInfo(Studentinfo studentinfo) {
        MyResult myResult=new MyResult();
        if(checkedStudentInfo(studentinfo.getStudentnum())){
            myResult.setStatus(400);
            myResult.setMsg("重复的学号");
            return myResult;
        }
        myResult.setMsg("提交成功");
        myResult.setStatus(200);
//        加密处理
        PasswordEncoder encoderMd5=new PasswordEncoder(salt,"MD5");
        String encode=encoderMd5.encode(studentinfo.getStudentpassword());
        studentinfo.setStudentpassword(encode);
        studentinfo.setStudentrole("student");
        studentinfoMapper.insert(studentinfo);
        return  myResult;
    }

    public boolean checkedStudentInfo(String studentinfonum) {
        Studentinfo studentinfo=studentinfoMapper.selectByPrimaryKey(studentinfonum);
        if(studentinfo!=null){
            return true;
        }
        return false;
    }

    public FormResult listAllStudentInfo(int page, int limit) {
        StudentinfoExample studentinfoExample=new StudentinfoExample();
        StudentinfoExample.Criteria criteria=studentinfoExample.createCriteria();
        PageHelper.startPage(page,limit);
        List<Studentinfo> list=studentinfoMapper.selectByExample(studentinfoExample);
        List<StudentInfoView>listview=new ArrayList<StudentInfoView>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getMajornum()!=null){
                Majorinfo majorinfo=majorinfoMapper.selectByPrimaryKey(list.get(i).getMajornum()+"");
                StudentInfoView studentInfoView=new StudentInfoView();
                BeanUtils.copyProperties(list.get(i),studentInfoView);
                studentInfoView.setMajornum(majorinfo.getMajorname());
                listview.add(studentInfoView);
            }
        }
        PageInfo<Studentinfo> pageInfo = new PageInfo<Studentinfo>(list);
        FormResult formResult=new FormResult();
        formResult.setCode(0);
        formResult.setCount(pageInfo.getTotal());
        formResult.setData(listview);
        formResult.setMsg("");
        return formResult;
    }

    public MyResult updateStudentInfo(Studentinfo studentinfo) {
        MyResult myResult=new MyResult();
        try{
            studentinfoMapper.updateByPrimaryKeySelective(studentinfo);
            myResult.setMsg("修改成功");
            myResult.setStatus(200);
            return myResult;
        }catch (Exception e){
            myResult.setStatus(400);
            myResult.setMsg("修改出错");
            return myResult;
        }
    }

    public MyResult delStudentInfo(String[] nums) {
        MyResult myResult=new MyResult();
        try {
            for(int k=0;k<nums.length;k++){
              studentinfoMapper.deleteByPrimaryKey(nums[k]);
            }
            myResult.setMsg("删除成功成功");
            myResult.setStatus(200);
            return myResult;
        }catch (Exception e){
            return  myResult;
        }
    }

    public FormResult searchStudentInfoByCondition(StudentInfoQueryVo studentInfoQueryVo) {
        FormResult formResult=new FormResult();
        StudentInfoView studentInfoView=studentInfoQueryVo.getStudentInfoView();
        studentInfoView.setPage((studentInfoView.getPage()-1)*studentInfoView.getLimit());
        List<StudentInfoView>list=myStudentInfoMapper.searchStudentInfoByCondition(studentInfoQueryVo);
        for(StudentInfoView studentInfoView1:list){
            studentInfoView1.setMajornum( majorinfoMapper.selectByPrimaryKey(studentInfoView1.getMajornum()).getMajorname());
        }
        if(list==null||list.size()==0){
            formResult.setCode(0);
            formResult.setCount((long) 0);
            formResult.setData(null);
            formResult.setMsg("查无结果");
        }
         Integer total=myStudentInfoMapper.searchStudentInfoCountByCondition(studentInfoQueryVo);
        formResult.setCode(0);
        formResult.setCount((long)total);
        formResult.setData(list);
        formResult.setMsg("");
        return formResult;
    }

    public MyResult searchstudentcourseinfo(String termyear, String termtime, String week, HttpSession session) {

       ActiveRole activeRole = (ActiveRole) session.getAttribute("activerole");
       List<CourseinfoCustom> list= courseinfoCustomMapper.showStuCourseInfoTable(activeRole.getUsernum(),termyear,termtime,Integer.parseInt(week));
       MyResult myResult=new MyResult();
       myResult.setData(list);
       myResult.setStatus(1);
        return myResult;
    }

    public MyResult login(String username, String password, HttpSession session) {
        MyResult myResult=new MyResult();
        StudentinfoExample studentinfoExample=new StudentinfoExample();
        StudentinfoExample.Criteria criteria=studentinfoExample.createCriteria();
        criteria.andStudentnumEqualTo(username);
        List<Studentinfo> list=studentinfoMapper.selectByExample(studentinfoExample);
        if(list==null||list.size()==0){
            myResult.setStatus(1);
            return myResult;
        }
        PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
        String encode = encoderMd5.encode(password);
        criteria.andStudentpasswordEqualTo(encode);
        list=studentinfoMapper.selectByExample(studentinfoExample);
        if(list==null||list.size()==0){
            myResult.setStatus(2);
            return  myResult;
        }
        List<Rolepermission>permissionlist=myStudentInfoMapper.selPermissionByStudentNum(list.get(0).getStudentnum());
        ActiveRole activeRole=new ActiveRole();
        activeRole.setPic(list.get(0).getStudentpic());
        activeRole.setUsername(list.get(0).getStudentname());
        activeRole.setList(permissionlist);
        activeRole.setUsernum(list.get(0).getStudentnum());
        activeRole.setRole(list.get(0).getStudentrole());
        session.setAttribute("activerole",activeRole);
        myResult.setStatus(3);
        return myResult;
    }

    public Studentinfo studentSelfInfo(HttpSession session){
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
        Studentinfo studentinfo=studentinfoMapper.selectByPrimaryKey(activeRole.getUsernum());
        return  studentinfo;
    }

    public MyResult editStudentInfoForSelf(Studentinfo studentinfo,HttpSession session) {
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
        studentinfo.setStudentnum(activeRole.getUsernum());
        OSSClient ossClient=new OSSClient(endpoint,accessKeyId,accessKeySecret);
        MyResult myResult=new MyResult();
//        密码处理
        if(studentinfo.getStudentpassword()!=""){
            PasswordEncoder encoderMd5 = new PasswordEncoder(salt, "MD5");
            String encode = encoderMd5.encode(studentinfo.getStudentpassword());
            studentinfo.setStudentpassword(encode);
        }
//        图片处理
        if(studentinfo.getStudentpic()!=""){
            studentinfo.setStudentpic("http://"+studentinfo.getStudentpic());
            String fileName= SubStringUtils.getSubStr(studentinfo.getStudentpic(),2);
//            删除原有的图片
            Studentinfo studentinfodelete=studentinfoMapper.selectByPrimaryKey(studentinfo.getStudentnum());
            if(studentinfodelete.getStudentpic()!=""&&studentinfodelete.getStudentpic()!=null){
                String delFileName=SubStringUtils.getSubStr(studentinfodelete.getStudentpic(),2);
                ossClient.deleteObject("xiaojianyu-file-server", delFileName);
            }
//            新增图片
            ossClient.setObjectAcl("xiaojianyu-file-server", fileName, CannedAccessControlList.PublicRead);
        }
        try{
            myStudentInfoMapper.updateStudentInfoForSelf(studentinfo);
            myResult.setStatus(1);
            myResult.setData(studentinfo.getStudentpic());
            return myResult;
        }catch(Exception e){
            myResult.setStatus(2);
            return myResult;
        }finally {
            ossClient.shutdown();
        }

    }

    public MyResult uploadStudentPic(MultipartFile uploadFile) {
        MyResult myResult=new MyResult();
        String oldName=uploadFile.getOriginalFilename();
        String type=uploadFile.getContentType();
        String prefix=oldName.substring(oldName.lastIndexOf(".")+1);
        String newName= UUID.randomUUID().toString();
        OSSClient ossClient=new OSSClient(endpoint,accessKeyId,accessKeySecret);
        try {
            InputStream inputStream=uploadFile.getInputStream();
            ossClient.putObject("xiaojianyu-file-server", "student/"+ newName+"."+prefix, inputStream);
//            ossClient.setObjectAcl("xiaojianyu-file-server", "test/ff.jpg", CannedAccessControlList.PublicRead);
            URL url = ossClient.generatePresignedUrl("xiaojianyu-file-server","student/"+ newName+"."+prefix,new Date());
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
        }finally {
            ossClient.shutdown();
        }
    }
}
