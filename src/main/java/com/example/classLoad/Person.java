package com.example.classLoad;

import lombok.Data;

@Data
public class Person {


    private Long id;

    private String name;

    public void hello() {
        System.out.println("hello!!!");
    }
}
