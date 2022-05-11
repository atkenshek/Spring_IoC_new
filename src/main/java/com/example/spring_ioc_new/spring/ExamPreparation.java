package com.example.spring_ioc_new.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExamPreparation {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("spring.xml");

        Student student = (Student) container.getBean("student");
        System.out.println(student.findTheAnswer(args[0]));
    }
}