package com.example.springapp.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.model.Person;

public interface PersonRepo extends JpaRepository<Person,Long>{
    @Query("SELECT p from Person p WHERE p.name like ?1%")
    List<Person> findByPersonByStartingWith(String name);

    @Query("SELECT p from Person p WHERE p.name like %?1")
    List<Person> findByPersonByEndingWith(String name);


}
