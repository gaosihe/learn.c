package servlet;

import dao.UserDAO;
import model.User;
import util.JSONUtil;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/user/login")
public class UserLoginServlet extends AbstractBaseServlet{

    @Override
    public Object process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
        User user = JSONUtil.read(req.getInputStream(),User.class);
        User queryUser = UserDAO.query(user);
        //根据用户名,密码从数据库查询用户
        if (queryUser == null){
            throw new RuntimeException("用户名或密码错误");
        }
        HttpSession session = req.getSession();//获取session,获取不到创建一个
        session.setAttribute("user",queryUser);
        return null;
    }
}
