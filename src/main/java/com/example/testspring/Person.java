package com.example.testspring;

import lombok.Data;

@Data
public class Person {
    private String name;
    private int age;
    private int height;
    private List<Car> carList;

}
