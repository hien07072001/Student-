package com.example.student.service;
import com.example.student.model.Subject;

import java.util.List;
import java.util.Optional;

public interface SubjectService {

    List<Subject> findAll();
    Optional<Subject> findById(Long id);
    void save(Subject subject);
    void remove(Long id);
}
