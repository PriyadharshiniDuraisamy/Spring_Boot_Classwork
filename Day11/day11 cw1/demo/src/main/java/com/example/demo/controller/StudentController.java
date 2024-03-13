package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bidirectional.model.Student;
import com.example.bidirectional.model.StudentInformation;
import com.example.bidirectional.service.StudentInformationService;
import com.example.bidirectional.service.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentInformationService studentInformationService;

    @PostMapping("/postVal")
    public ResponseEntity<Student> post(@RequestBody Student student) {

        try {
            return new ResponseEntity<>(studentService.create(student), HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/post")
    public ResponseEntity<StudentInformationRepository> post1(@RequestBody StudentInformationRepository studentInformation) {

        try {
            return new ResponseEntity<>(studentInformationService.create(studentInformation), HttpStatus.CREATED);
        } catch (Exception e) {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/get")
    public ResponseEntity<List<Student>> getAllJob() {
        List<Student> job = studentService.getAllJobs();
        return new ResponseEntity<>(job, HttpStatus.OK);
    }

    @GetMapping("/api/student/{id}")
    public ResponseEntity<Student> getById(@PathVariable int id) {
        Student job = studentService.getJobId(id);
        if (job != null) {
            return new ResponseEntity<>(job, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

// import com.example.demo.repository.StudentRepo;


// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.example.demo.model.Student;

// @RestController
// public class StudentController {
//     @Autowired
//     private StudentRepo studentRepo;
    

//     @PostMapping("/post")
//     public Student create(@RequestBody Student student)
//     {
//         return studentRepo.save(student);
//     }

//     @GetMapping("/students")
//     public List<Student>findAllStudent()
//     {
//         return studentRepo.findAll();
//     }
// }