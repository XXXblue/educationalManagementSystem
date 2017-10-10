package interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Author: XBlue
 * @Date: Create in 2017/9/2119:42
 * @Description:
 * @Modified By:
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String resourceurl=request.getRequestURI();
        HttpSession session=request.getSession();
        if(resourceurl.equals("/login")||resourceurl.equals("/loginsubmit")||resourceurl.equals("/loginteachersubmit")||resourceurl.equals("/loginstudentsubmit")){
            return true;
        }
        if(session.getAttribute("activerole")!=null){
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
        return false;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
