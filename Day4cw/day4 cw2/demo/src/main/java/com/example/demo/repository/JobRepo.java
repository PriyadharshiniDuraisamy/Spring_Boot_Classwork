package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Job;

public interface JobRepo extends JpaRepository<Job,Integer> {
    
}
