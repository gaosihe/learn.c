package frank.Servlet;

import frank.Callback;
import frank.dao.ArticleDAO;
import frank.model.Article;
import frank.model.Response;
import frank.util.JSONUtil;
import frank.util.Util;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

//@WebServlet("/articleList")
public class ArticleListServlet extends AbstractBaseServlet {
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String id = req.getParameter("id");//获取前端数据:用户id
        List<Article> articles = ArticleDAO.query(Integer.parseInt(id));
        return articles;
    }
}
