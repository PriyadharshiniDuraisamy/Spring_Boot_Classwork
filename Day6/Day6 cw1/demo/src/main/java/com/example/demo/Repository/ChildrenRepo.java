package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Children;

public interface ChildrenRepo extends JpaRepository<Children,Integer> {

    
}
