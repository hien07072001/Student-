package com.example.student.controller;

import com.example.student.model.ClassRoom;
import com.example.student.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class ClassRoomController {
    @Autowired
    private ClassService classService;

    @GetMapping(value = "/class")
    public ResponseEntity<List<ClassRoom>> listClass() {
        List<ClassRoom> classRoomList;
        classRoomList = classService.findAll();
        if (classRoomList.isEmpty()) {
            return new ResponseEntity<List<ClassRoom>>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<List<ClassRoom>>(classRoomList, HttpStatus.OK);
        }
    }
}
