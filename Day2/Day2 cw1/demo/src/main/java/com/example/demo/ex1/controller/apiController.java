package com.example.demo.ex1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ex1.config.appConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class apiController {
     @Autowired
    appConfig a;
    
    @GetMapping("/config")
    public String getAppName() {
        return a.getAppName()+a.getAppVersion();
    }
    
}

