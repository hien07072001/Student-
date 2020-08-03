package com.example.student.model;

import javax.persistence.*;

@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String codeSj;
    private String note;
    private int ScoreFactor;
    private double point;

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public int getScoreFactor() {
        return ScoreFactor;
    }

    public void setScoreFactor(int scoreFactor) {
        ScoreFactor = scoreFactor;
    }

    @ManyToOne
    private Student student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodeSj() {
        return codeSj;
    }

    public void setCodeSj(String codeSj) {
        this.codeSj = codeSj;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
