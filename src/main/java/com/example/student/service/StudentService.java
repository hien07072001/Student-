package com.example.student.service;
import com.example.student.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> findAll();
    Optional<Student> findById(Long id);
    void save(Student student);
    void remove(Long id);
}
