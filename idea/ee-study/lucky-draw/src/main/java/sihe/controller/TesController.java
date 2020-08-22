package sihe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sihe.mapper.Test;

@RestController
@RequestMapping("/test")
public class TesController {
    @Autowired
    private Test test;

    @GetMapping("/1")
    public Object test1(){
        return test.query(1);
    }
}
