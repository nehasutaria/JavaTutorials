package com.designPattern.factoryDP.example;

public class ShapeFactory {
    public Shape createShape(String str){
        if(null == str)
            return null;
        else if(str.equals("circle"))
            return new Circle();
        else if(str.equals("square"))
            return new Square();
        else
            return null;
    }
}
