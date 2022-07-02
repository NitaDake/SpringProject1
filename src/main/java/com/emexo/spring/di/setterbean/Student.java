package com.emexo.spring.di.setterbean;

public class Student {
    private int studId;
    private String studName;
    private String studAddress;
    private Marks marks;

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public void setStudAddress(String studAddress) {
        this.studAddress = studAddress;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    public void getStudentDetails() {
        System.out.println("Student Id:" + studId);
        System.out.println("Student Name:" + studName);
        System.out.println("Student Address:" + studAddress);
        marks.getMarks();


    }
}
