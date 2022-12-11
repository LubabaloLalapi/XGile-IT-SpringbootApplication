package com.example.demo.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

// @Entity annotation defines that a class can be mapped to a table




@Getter //Getter Method
@Setter //Setter Method


public class StudentRequest {
    // @Id annotation specifies the entity primary key.
    @Id

    // @GeneratedValue annotation to specify the primary key generation strategy to use
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;


    private String surname;
    private int age;


    //Default constructor
    public StudentRequest() {
        super();
    }

    //Non-default constructor
    public StudentRequest(String name,String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
}