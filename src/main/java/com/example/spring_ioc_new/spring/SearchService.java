package com.example.spring_ioc_new.spring;

import java.util.List;

public interface SearchService {
    List<Integer> find(String searchObjectName, String searchInput);
}