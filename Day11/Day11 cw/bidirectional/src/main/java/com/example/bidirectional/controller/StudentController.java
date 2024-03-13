package com.example.bidirectional.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirectional.model.Student;
import com.example.bidirectional.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    private StudentService studentService;
    
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student/create")
    public Student postStudent(@RequestBody Student student) {
        
        return studentService.createStudent(student);
    }
    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }
    
}
