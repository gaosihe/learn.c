package sihe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sihe.model.Setting;
import sihe.model.User;
import sihe.service.SettingService;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/setting")
public class SettingController {
    @Autowired
    private SettingService settingService;

    @GetMapping("/query")
    public Object query(HttpSession session){
        //Cookie中携带tomcat的session实现，也就是请求头包含的Cookie:JSESSIONID=xxx
        //比如服务器重启，或没有登录但携带JSESSIONID的信息，获取的HTTP Session对象不为空
        //登录以后才能访问接口,从会话中获取保存的用户信息
        //如果实现拦截器，一定登录才能访问
        User user = (User) session.getAttribute("user");
        Setting setting = settingService.query(user.getId());
        setting.setUser(user);
        return setting;
    }

    @GetMapping("/update")
    public Object update(Integer batchNumber,HttpSession session){
        User user = (User) session.getAttribute("user");
        settingService.update(user.getId(),batchNumber);
        return null;
    }
}
