package com.designPattern.factoryDP.example;

public class Square implements Shape {
    @Override
    public void area(double l) {
        System.out.println("Area of Square: " + l * l);
    }
}
