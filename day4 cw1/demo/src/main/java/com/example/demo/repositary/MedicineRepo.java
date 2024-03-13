package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Integer> {
    
    
}
