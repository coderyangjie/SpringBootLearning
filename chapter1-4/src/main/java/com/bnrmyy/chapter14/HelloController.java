package com.bnrmyy.chapter14;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${com.bnrmyy.from:}")
    private String from;

    @RequestMapping("/hello")
    public  String index(){
        return "hello "+from;
    }
}
