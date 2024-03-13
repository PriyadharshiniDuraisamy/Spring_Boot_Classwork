package com.example.demo.Controller;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class cw1 {
    @GetMapping("/helo")
    public String getMethodName() {
        return "WElcome hi";
    }
}