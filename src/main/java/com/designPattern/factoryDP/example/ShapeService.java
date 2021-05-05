package com.designPattern.factoryDP.example;

public class ShapeService {
    public static void main(String[] args){
        ShapeFactory sf = new ShapeFactory();
        Shape shape = sf.createShape("square");
        shape.area(5);
    }
}
