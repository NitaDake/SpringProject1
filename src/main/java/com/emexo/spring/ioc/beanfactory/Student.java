package com.emexo.spring.ioc.beanfactory;

public class Student {
    private int studId=1;
    private String studName="Nita";
    public Student(){
        System.out.println("Student constructor...");
    }
    public void getStudentDetails(){
        System.out.println("Student Id:"+studId);
        System.out.println("student Name:"+studName);
    }
}
