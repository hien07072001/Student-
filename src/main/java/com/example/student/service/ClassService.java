package com.example.student.service;

import com.example.student.model.ClassRoom;

import java.util.List;
import java.util.Optional;

public interface ClassService {

    List<ClassRoom> findAll();
    Optional<ClassRoom> findById(Long id);
    void save(ClassRoom classRoom);
    void remove(Long id);
}
