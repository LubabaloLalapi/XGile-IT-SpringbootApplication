package com.example.demo.controller;

import com.example.demo.models.StudentRequest;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public void add() {
        studentService.addStudent();
    }

    @GetMapping("/getAll")
    public ArrayList<StudentRequest> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getAllById/{id}")
    public StudentRequest getStudentById(@PathVariable long id) {
        return studentService.getStudentByID(id);
    }

    @DeleteMapping("/deleteStudent")
    public void deleteStudent() {
        studentService.deleteStudent();
    }
}