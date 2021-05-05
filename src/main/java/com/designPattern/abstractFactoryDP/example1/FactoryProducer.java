package com.designPattern.abstractFactoryDP.example1;

public class FactoryProducer {
    public static AbstractFactory createFactory(String choice){
        if(choice.equals("BANK"))
            return new BankFactory();
        else if(choice.equals("LOAN"))
            return new LoanFactory();
        else
            return null;
    }
}
