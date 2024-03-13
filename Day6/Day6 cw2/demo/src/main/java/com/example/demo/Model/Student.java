package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private int id;
    private String SName;
    private int age;
    private String city;
    private String rollno;
    
    public Student() {
    }

    public Student(int id, String sName, int age, String city, String rollno) {
        this.id = id;
        SName = sName;
        this.age = age;
        this.city = city;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSName() {
        return SName;
    }

    public void setSName(String sName) {
        SName = sName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    
}
