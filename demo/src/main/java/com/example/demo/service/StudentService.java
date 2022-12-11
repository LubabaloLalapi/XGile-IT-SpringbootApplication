package com.example.demo.service;

import com.example.demo.models.StudentRequest;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentService implements StudentServices {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public ArrayList<StudentRequest> getAllStudents() {
        return (ArrayList<StudentRequest>) studentRepository.findAll();
    }

    @Override
    public StudentRequest getStudentByID(long id) {

        //need to understand this Optional class
        Optional<StudentRequest> student = studentRepository.findById(id);

        return student.orElse(null);
    }

    @Override
    public void addStudent() {

        ArrayList<StudentRequest> student = new ArrayList<>();

        student.add(new StudentRequest("Pumela", "Jafta",27));
        student.add(new StudentRequest("Bonga", "Stoto",25));
        student.add(new StudentRequest("Bulumko", "Kalimashe",27));


        for (StudentRequest students : student) {
            studentRepository.save(students);
        }

    }

    @Override
    public void deleteStudent() {
        studentRepository.deleteAll();
    }
}
