package serviceImpl;

import mapper.ManagerinfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import othermapper.MyManagerMapper;
import po.Managerinfo;
import po.ManagerinfoExample;
import po.Rolepermission;
import poView.ActiveRole;
import service.ManagerService;
import util.MyResult;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Set;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2017:17
 * @Description:
 * @Modified By:
 */
@Controller
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerinfoMapper managerinfoMapper;
    @Autowired
    private MyManagerMapper myManagerMapper;
    public MyResult login(String username, String password, HttpSession session) {
        MyResult myResult=new MyResult();
        ManagerinfoExample managerinfoExample=new ManagerinfoExample();
        ManagerinfoExample.Criteria criteria=managerinfoExample.createCriteria();
       criteria.andManagernumEqualTo(username);
      List<Managerinfo> list=managerinfoMapper.selectByExample(managerinfoExample);
      if(list==null||list.size()==0){
          myResult.setStatus(1);
          return myResult;
      }
      criteria.andManagerpasswordEqualTo(password);
      list=managerinfoMapper.selectByExample(managerinfoExample);
      if(list==null||list.size()==0){
          myResult.setStatus(2);
          return myResult;
      }
      List<Rolepermission>permissionlist=myManagerMapper.selPermissionByManagerNum(list.get(0).getManagernum());
      ActiveRole activerole=new ActiveRole();
      activerole.setUsername(list.get(0).getManagername());
      activerole.setRole(list.get(0).getManagerrole());
      activerole.setList(permissionlist);

      session.setAttribute("activerole",activerole);
      myResult.setStatus(3);
      return myResult;
    }

    public MyResult logout(HttpSession session) {
        session.removeAttribute("activerole");
        MyResult myResult=new MyResult();
        myResult.setStatus(1);
        myResult.setMsg("退出成功");
        return  myResult;
    }
}
