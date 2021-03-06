package frank.Servlet;

import frank.dao.ArticleDAO;
import frank.model.Article;
import frank.util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/articleUpdate")
public class ArticleUpdateServlet extends AbstractBaseServlet{
    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        Article article = JSONUtil.deserialize(req.getInputStream(),Article.class);
        int num = ArticleDAO.uptade(article);
        if (article == null)
            throw new RuntimeException("插入文章详情出错");
        return null;
    }
}
