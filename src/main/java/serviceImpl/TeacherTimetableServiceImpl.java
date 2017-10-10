package serviceImpl;

import mapper.CourseinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import othermapper.MyCourseMapper;
import po.Courseinfo;
import po.CourseinfoExample;
import poView.ActiveRole;
import service.TeacherTimetableService;
import util.MyResult;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2311:06
 * @Description:
 * @Modified By:
 */
@Service
public class TeacherTimetableServiceImpl implements TeacherTimetableService {
    @Autowired
    private MyCourseMapper myCourseMapper;
    public MyResult searchTeacherTimetable(String termYear, String termTime, String Week,HttpSession session) {
//        从session中读取教师工号
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
//        进行查询
      List<Courseinfo> list=myCourseMapper.selTeacherTimetale(activeRole.getUsernum(),termYear,termTime,Week);
      MyResult myResult=new MyResult();
      myResult.setStatus(1);
      myResult.setData(list);
      myResult.setMsg("成功查询");
        return myResult;
    }
}
