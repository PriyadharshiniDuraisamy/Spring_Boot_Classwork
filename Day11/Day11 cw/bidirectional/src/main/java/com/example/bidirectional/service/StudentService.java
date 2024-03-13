package com.example.bidirectional.service;

import org.springframework.stereotype.Service;

import com.example.bidirectional.model.Student;
import com.example.bidirectional.repository.StudentRepository;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
