package com.example.demo.Controller;



import org.springframework.web.bind.annotation.RestController;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import com.example.demo.Model.student;

@RestController
public class studentController {
    @GetMapping("/student")
    public List<student> getStudent() {
        List<student>studentList=new ArrayList<student>();
        student a=new student("John","WelcomeJohn");
        studentList.add(a);
        return studentList;
    }
    
}

