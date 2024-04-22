package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo1 {
    @RequestMapping("demo1")
    public String getName(){
        System.out.println("ok");
        return "hello,world";
    }
}
