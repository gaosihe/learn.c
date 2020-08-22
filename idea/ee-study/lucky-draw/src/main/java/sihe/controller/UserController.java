package sihe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sihe.model.User;
import sihe.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Object login(@RequestBody User user, HttpServletRequest req){
        //如果用户密码校验失败,在service中抛异常
        User exist = userService.login(user);
        HttpSession session = req.getSession();
        session.setAttribute("user",exist);
        return null;
    }
}
