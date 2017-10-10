package service;

import util.MyResult;

import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2017:16
 * @Description:
 * @Modified By:
 */
public interface ManagerService {
//    管理员登录
    public MyResult login(String username, String password, HttpSession session);
//    登出
    public MyResult logout(HttpSession session);
}
