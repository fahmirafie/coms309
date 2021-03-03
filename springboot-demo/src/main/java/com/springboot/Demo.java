package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {

    @RequestMapping("/")
    public String index() {
        return "Hello there, this is a demo project for Spring Boot 2. My initial experiment doesn't work. Sorry about that";
    }
}
