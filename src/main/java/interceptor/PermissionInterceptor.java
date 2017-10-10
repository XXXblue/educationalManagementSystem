package interceptor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import po.Rolepermission;
import poView.ActiveRole;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2014:18
 * @Description:
 * @Modified By:
 */
public class PermissionInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url=request.getRequestURI();
        HttpSession session=request.getSession();
        ActiveRole activeRole= (ActiveRole) session.getAttribute("activerole");
//        放行公页
        if(url.equals("/login")||url.equals("/loginsubmit")||url.equals("/logout")||url.equals("/loginteachersubmit")||url.equals("/loginstudentsubmit")){
            return true;
        }
        for(Rolepermission rolepermission:activeRole.getList()){
               if(url.indexOf(rolepermission.getUrl())>=0){
                   return true;
               }
        }
        request.getRequestDispatcher("/WEB-INF/views/refuse.jsp").forward(request, response);
        return  false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
