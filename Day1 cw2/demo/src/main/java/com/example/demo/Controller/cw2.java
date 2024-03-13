package com.example.demo.Controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class cw2 {
    @RequestMapping("/studentName")
    public String student(@RequestParam String studentName) {
        return "Welcome "+studentName+"!";
        
    }
}   
    

