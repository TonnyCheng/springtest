package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by cyb on 2017/6/7.
 */
@RestController
public class Controller {
    @RequestMapping("/hello")
    public String test(){
        return "hello  spring Boot";
    }
}
