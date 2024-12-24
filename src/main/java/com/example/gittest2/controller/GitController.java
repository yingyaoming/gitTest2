package com.example.gittest2.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    public void get(){
        System.out.println("用户已登录");
    }
}
