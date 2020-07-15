package filter;

import model.Response;
import util.JSONUtil;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.server.ExportException;

//过滤器:http请求的url匹配过滤器路径规则,才会过滤
@WebFilter("/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)request;
        HttpServletResponse res = (HttpServletResponse)response;
        //页面的静态资源,后台服务
        // 需要处理的敏感资源
        // 1.首页/public/page/main.html.没有登陆重定向到登录页面
        // 2.后端的服务资源:除登录接口/user/login外,其他接口,没有登录 返回没有登录的json信息.
        //获取session信息
        HttpSession session = req.getSession(false);//没有session,null
        if(session == null) {
            //获取当前http请求路径
            String uri = req.getServletPath();
            if ("/public/page/main.html".equals(uri)){//首页没有登录就重定向
                String schema= req.getScheme();//http
                String host = req.getServerName();//ip或域名
                int port = req.getServerPort();//服务器端口号
                String contextPath= req.getContextPath();//署名
                String  basePath= schema+"://"+host+":"+port+contextPath;
                res.sendRedirect(basePath+"/public/index.html");
                return;
            }else if(!"/user/login".equals(uri)&& !uri.startsWith("/public/")
                    && !uri.startsWith("/static/")){
                req.setCharacterEncoding("UTF-8");//设置请求数据编码格式
                res.setCharacterEncoding("UTF-8");
                res.setContentType("application/json");//设置响应数据格式
                Response r = new Response();
                r.setCode("301");
                r.setMessage("未授权的HTTP请求");
                PrintWriter pw = res.getWriter();
                pw.println(JSONUtil.write(r));
                pw.flush();
                return;
            }
        }
        chain.doFilter(request,response);//过滤器向下调用,再次过滤
    }

    @Override
    public void destroy() {

    }
}
