package com.example.student.service.Impl;

import com.example.student.model.Subject;
import com.example.student.repository.SubjectRepository;
import com.example.student.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubjectImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> findAll() {
        return null;
    }

    @Override
    public Optional<Subject> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(Subject subject) {
    }

    @Override
    public void remove(Long id) {

    }
}
