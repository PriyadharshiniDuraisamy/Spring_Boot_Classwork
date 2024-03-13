package com.example.demo.Controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pah {
   @GetMapping ("/hello")
   public String welcome(){
        return "Hello World!";
   }
}