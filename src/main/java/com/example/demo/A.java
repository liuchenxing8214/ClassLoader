package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class A {


    @Autowired
    public B b;

    public void printBName() {
        System.out.println(b.name);
    }
}