package com.example.spring_ioc_new.spring;

import java.util.List;

public class Student {
    private final SearchService service;
    private final String nameOfTheTextBook;

    Student(SearchService service, String nameOfTheTextBook) {
        this.service = service;
        this.nameOfTheTextBook = nameOfTheTextBook;
    }

    public List<Integer> findTheAnswer(String examQuestion) {
        System.out.println(examQuestion);
        return service.find(nameOfTheTextBook, examQuestion);
    }
}