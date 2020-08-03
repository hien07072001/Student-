package com.example.student.service.Impl;

import com.example.student.model.ClassRoom;
import com.example.student.repository.ClassRoomRepository;
import com.example.student.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassImpl implements ClassService {

    @Autowired
    private ClassRoomRepository classRepository;

    @Override
    public List<ClassRoom> findAll() {
        return (List<ClassRoom>) classRepository.findAll();
    }

    @Override
    public Optional<ClassRoom> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void save(ClassRoom classRoom) {

    }

    @Override
    public void remove(Long id) {

    }
}
