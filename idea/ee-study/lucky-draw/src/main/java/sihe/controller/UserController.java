package sihe.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import sihe.model.Setting;
import sihe.model.User;
import sihe.service.SettingService;
import sihe.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private SettingService settingService;

    @PostMapping("/login")
    public Object login(@RequestBody User user, HttpServletRequest req){
        //如果用户密码校验失败,在service中抛异常
        User exist = userService.login(user);
        //可以提供一个方法,根据用户id,获取setting_id
        Setting setting = settingService.query(exist.getId());//
        exist.setSettingId(setting.getId());
        HttpSession session = req.getSession();
        session.setAttribute("user",exist);
        return null;
    }
    @PostMapping("/register")
    public Object register(User user,
                           //上传的头像:1.保存在本地文件夹(web服务器需要加载到) 2.url存放在注册用户的head字段
                           @RequestPart(value = "headFile", required = false) MultipartFile headFile){
        //没有做服务器请求数据校验,实现方式:1.手动校验2.使用validation框架校验(很多注解)
        //TODO
        userService.register(user,headFile);
        return null;
    }
}
