package sihe.config.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.HandlerInterceptor;
import sihe.base.ResponseResult;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class LoginInterceptor implements HandlerInterceptor {

    private ObjectMapper objectMapper;
    public LoginInterceptor(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    /**
     * if(session != null && session.getAttribute("user") != null) return ture;===>继续执行
     * else 返回一个带错误码和错误信息的json
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if (session != null && session.getAttribute("user") != null){
            return true;//登录,继续执行Controller中得方法
        }
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);//浏览器解析的数据格式和编码
        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        ResponseResult r = ResponseResult.error("SES000","没有登录");
        PrintWriter pw = response.getWriter();
        pw.println(objectMapper.writeValueAsString(r));
        pw.flush();

        return false;
    }
}
