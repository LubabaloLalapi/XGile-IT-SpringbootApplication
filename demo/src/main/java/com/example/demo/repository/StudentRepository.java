package com.example.demo.repository;

import com.example.demo.models.StudentRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudentRepository extends JpaRepository<StudentRequest, Long> {
    ArrayList<StudentRequest> getAllStudents();

}
