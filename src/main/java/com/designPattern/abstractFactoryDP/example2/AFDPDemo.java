package com.designPattern.abstractFactoryDP.example2;
public class AFDPDemo {
    public static void main(String[] args){
        AbstractShapeFactory factory = FactoryProducer.getFactory(true);
        Shape shape1 = factory.getShapeFactory("SQUARE");
        shape1.draw();
        AbstractShapeFactory factory1 = FactoryProducer.getFactory(false);
        Shape shape2 = factory1.getShapeFactory("SQUARE");
        shape2.draw();




    }
}
