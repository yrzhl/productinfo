package com.yrz.productinfo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerController {

    @RequestMapping("/msg")
    public String msg(){
        return  "this is message 2 feign!";
    }

}
