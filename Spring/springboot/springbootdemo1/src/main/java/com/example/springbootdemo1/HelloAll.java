package com.example.springbootdemo1;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class HelloAll {
    @RequestMapping("/")
    public String welcome() {
        return "Welcome All to SpringBoot";
    }
}
