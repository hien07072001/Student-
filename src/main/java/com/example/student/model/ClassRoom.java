package com.example.student.model;

import javax.persistence.*;

@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String nameClass;
    private String codeCl;
    private double hours;
    private String note;

    @ManyToOne
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }


    public String getCodeCl() {
        return codeCl;
    }

    public void setCodeCl(String codeCl) {
        this.codeCl = codeCl;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }


}
