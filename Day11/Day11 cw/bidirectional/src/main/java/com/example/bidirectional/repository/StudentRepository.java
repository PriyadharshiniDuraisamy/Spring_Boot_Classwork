package com.example.bidirectional.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bidirectional.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    
}
