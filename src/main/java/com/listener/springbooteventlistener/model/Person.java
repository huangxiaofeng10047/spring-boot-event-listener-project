package com.listener.springbooteventlistener.model;


import lombok.Data;

@Data
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
}
