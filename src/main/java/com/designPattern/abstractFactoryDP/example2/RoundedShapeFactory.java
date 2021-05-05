package com.designPattern.abstractFactoryDP.example2;

public class RoundedShapeFactory extends AbstractShapeFactory{
    @Override
    Shape getShapeFactory(String str) {
        if(str.equals("RECTANGLE"))
            return new RoundedRectangle();
        else if (str.equals("SQUARE"))
            return new RoundedSquare();
        else
            return null;
    }
}
