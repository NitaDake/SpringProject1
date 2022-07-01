package com.emexo.spring.ioc.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import javax.xml.bind.annotation.XmlAccessOrder;

public class TestMain {
    public static void main(String[] args) {
        XmlBeanFactory factory =new XmlBeanFactory(new ClassPathResource("beanfactory.xml"));
        Employee employee =factory.getBean("emp",Employee.class);
        employee.getEmployeeDetails();
        Student student=factory.getBean("stu",Student.class);
        student.getStudentDetails();
    }
}
