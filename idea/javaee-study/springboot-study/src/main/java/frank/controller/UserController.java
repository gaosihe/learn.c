package frank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    @ResponseBody
    public Object login(){
        Map<String,String> map = new HashMap<>();
        map.put("man","博哥");
        map.put("tea","汤神");
        return map;
    }
}
