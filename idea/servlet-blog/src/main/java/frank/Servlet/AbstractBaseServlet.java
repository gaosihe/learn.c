package frank.Servlet;

import frank.model.Response;
import frank.util.JSONUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public abstract class AbstractBaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
    //模板设计模式
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");//请求体编码
        resp.setCharacterEncoding("UTF-8");//响应体设置编码
        resp.setContentType("application/json;charset=UTF-8");//浏览器接收数据解析方式


        Response response = new Response();
        //jdbc 操作:查询文章列表
        try {
            response.setData(process(req,resp));
            response.setSuccess(true);
        } catch (Exception e) {//出现异常返回success=false,并设置错误消息.异常堆栈
            response.setMessage(e.getMessage());
            StringWriter sw = new StringWriter();
            PrintWriter writer = new PrintWriter(sw);
            e.printStackTrace(writer);
            response.setStackTrace(sw.toString());
        }

        PrintWriter pw = resp.getWriter();
        pw.println(JSONUtil.serialize(response));
        pw.flush();
    }

    public abstract Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception;
}