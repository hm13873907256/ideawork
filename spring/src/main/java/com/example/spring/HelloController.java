package com.example.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${name}")
    private String name;
    @Value("${testurl}")
    private String testurl;
    @RequestMapping("/hello")
    public String hello(){
        return name+"     "+testurl;
    }
}
