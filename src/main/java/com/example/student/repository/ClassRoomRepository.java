package com.example.student.repository;

import com.example.student.model.ClassRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepository extends CrudRepository< ClassRoom,Long> {
}
