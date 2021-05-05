package com.designPattern.abstractFactoryDP.example1;

public class Demo {
    public static void main(String[] args){
        AbstractFactory factory = FactoryProducer.createFactory("BANK");
        Bank bank1 = factory.getFactory("SBI");
        System.out.println(bank1.getName());

        AbstractFactory factory1 = FactoryProducer.createFactory("LOAN");
        Bank bank2 = factory1.getFactory("HOME");
        System.out.println(bank2.getName());
    }
}
