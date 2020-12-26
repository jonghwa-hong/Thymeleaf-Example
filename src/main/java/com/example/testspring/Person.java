package com.example.testspring;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Person {
    private String name;
    private int age;
    private int height;
    private List<Car> carList;

}
