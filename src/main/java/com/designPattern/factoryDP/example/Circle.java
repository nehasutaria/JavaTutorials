package com.designPattern.factoryDP.example;

public class Circle implements Shape {

    @Override
    public void area(double l) {
        System.out.println("Area of Circle: " + (3.14 * l * l));
    }
}
