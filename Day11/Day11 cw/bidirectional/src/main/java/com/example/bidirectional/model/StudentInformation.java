package com.example.bidirectional.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class StudentInformation {
    @Id

    private int studentInfoId;
    private String phno;
    private String city;


    @OneToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private Student student;
}
