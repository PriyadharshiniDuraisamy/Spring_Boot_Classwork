package com.example.springapp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;

@Service
public class PersonService {
    public PersonRepo personRepo;
    public PersonService(PersonRepo personRepo)
    {
        this.personRepo = personRepo;
    }

    public boolean savePerson(Person person)
    {
        try
        {
            personRepo.save(person);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<Person> getByStarting(String name)
    {
        return personRepo.findByPersonByStartingWith(name);
    }
    public List<Person> getByEnding(String name)
    {
        return personRepo.findByPersonByEndingWith(name);
    }
}
