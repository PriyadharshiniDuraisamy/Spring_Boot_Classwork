package com.example.demo.Controller;






import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Model.PostModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class PostManController {
    @PostMapping("/post")
    public PostModel postMethodName(@RequestBody PostModel entity) {
      
        return entity;
    }
    
}