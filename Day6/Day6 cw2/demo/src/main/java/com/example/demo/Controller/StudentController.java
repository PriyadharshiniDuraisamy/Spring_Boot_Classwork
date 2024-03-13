package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Student;
import com.example.demo.Service.StudentService;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> addChildren(@RequestBody Student student) {
        Student addStudent=studentService.addStudent(student);

        return new ResponseEntity<>(addStudent,HttpStatus.CREATED);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getStudent() {
        List<Student> g=studentService.getStudent();
        return new ResponseEntity<>(g,HttpStatus.OK);
    }
    
     @GetMapping("/api/student/{offset}/{pagesize}")
    public ResponseEntity<Page<Student>> getPaginationStudent(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize) 
    {
        Page<Student> students=studentService.paginationStudent(offset,pagesize);
        if(students!=null){
            return new ResponseEntity<>(students,HttpStatus.OK);
        }
        return new ResponseEntity<>(students,HttpStatus.NOT_FOUND);
    } 
    @GetMapping("/api/students/{offset}/{pagesize}/{field}")
    
    public ResponseEntity<Page<Student>> getpageSortStudent(@PathVariable("offset") int offset, @PathVariable("pagesize") int pagesize, @PathVariable("field") String field) 
    {
        Page<Student> sort = studentService.pageSortStudent(offset, pagesize, field);
        if(sort != null) {
            return new ResponseEntity<>(sort, HttpStatus.OK);
        }
        return new ResponseEntity<>(sort, HttpStatus.NOT_FOUND);
    }
}


