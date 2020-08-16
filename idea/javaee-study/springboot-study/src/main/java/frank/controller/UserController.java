package frank.controller;

import frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
//当前类型注册实例到容器中,并指定web请求的处理
@Controller
//@RequestMapping可以定义请求相关的配真::如路径,请求方法等
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
//    @Resource
    private Map<Integer,Integer> test1;
//    @Autowired
////    private User user1;//变量名就是Bean的名称,否则会报错
//    @Qualifier("user2")
//    private User user;
    @Resource(name = "user2")
    private User user;
    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(User user, HttpServletRequest req){
        //模拟用户登录,在数据库校验用户名密码
        if ("abc".equals(user.getUsername())){
            throw new RuntimeException("用户登录失败!");
        }
        HttpSession session = req.getSession();
        session.setAttribute("user",user);
        //return test1;
        return user;
    }

    @RequestMapping("/m")
    public String m(){
        return "/main.html";
    }
    @RequestMapping("/l1")
    public String l1(){
        //返回路径,不带/:当前请求的路径为相对位置.如果返回路径
        // 带/,会去掉这个路径,以项目的部署路径为相对位置
        //return "forward:login";//以当前请求路径
        return "forward:/user/login";//带/以项目路径查找login
    }
    @RequestMapping("/l2")
    public String l2(){
        return "redirect:/user/login";
    }
    @RequestMapping("/test/{key}")//路径中使用变量占位符
    @ResponseBody
    public Object test1(@PathVariable("key")Integer k){
        System.out.println("========="+test1.get(k));
        return test1;
    }
    //请求get /user/test2?k1=v1&k2=v2&k3=v3
    @RequestMapping(value = "/test2",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Object test2(
            @RequestParam("k1") String k1,//写全的做法
            @RequestParam String k2,//省略注解值
            String k3//最省略的做法
    ){
        System.out.println("============"+k1+" "+k2+" "+k3);
        return test1;
    }
    @RequestMapping("/test3")
    @ResponseBody
    public Object test3(User user){//请求数据自动映射到参数类型的属性中:username =xxx&password=xxx

        System.out.println(user);
        return test1;
    }
    @RequestMapping("/test4")
    @ResponseBody
    public Object test4(){
        return null;//响应体为空===>配置ControllerAdvice时不会进入重写响应体的方法
    }
    @RequestMapping("/test5")
    @ResponseBody
    public Object test5(){
        return "ok";//返回字符串,响应数据格式不再是appliaction/json格式,而是text/plain,而是字符串内容

    }
    @RequestMapping("/test6")
    @ResponseBody
    public Object test6(HttpServletRequest req, HttpServletResponse res){
        //http请求基于Servlet,spring已经生成了request和response对象.可以直接在参数中使用
        System.out.println("============"+req.getParameter("username")+","+req.getParameter("password"));

        return null;
    }
    @RequestMapping("/test7")
    @ResponseBody
    public Object test7(@RequestBody User user){
        System.out.println("==============="+user);
        return null;
    }
    @RequestMapping("/test8")
    @ResponseBody
    public Object test8(){
        throw new RuntimeException("数据库报错了");
    }
}
