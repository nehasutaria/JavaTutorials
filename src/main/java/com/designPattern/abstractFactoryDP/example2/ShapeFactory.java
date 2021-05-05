package com.designPattern.abstractFactoryDP.example2;

public class ShapeFactory extends AbstractShapeFactory {
    @Override
    public Shape getShapeFactory(String str) {
        if(str.equals("RECTANGLE"))
            return new Rectangle();
        else if(str.equals("SQUARE"))
            return new Square();
        else
            return null;
    }
}
