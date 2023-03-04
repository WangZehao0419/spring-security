package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @PostMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello ok";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
