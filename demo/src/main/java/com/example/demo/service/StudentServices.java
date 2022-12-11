package com.example.demo.service;

import com.example.demo.models.StudentRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


public interface StudentServices {

    ArrayList<StudentRequest> getAllStudents();

    StudentRequest getStudentByID(long id);

    //creates a student
    void addStudent();

    //deletes all students
    void deleteStudent();
}
