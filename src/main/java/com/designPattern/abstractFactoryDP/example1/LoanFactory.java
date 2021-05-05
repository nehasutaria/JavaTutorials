package com.designPattern.abstractFactoryDP.example1;

public class LoanFactory extends AbstractFactory {
    @Override
    Bank getFactory(String str) {
        if(str.equals("HOME"))
            return new HOME();
        else if(str.equals("EDUCATION"))
            return new EDUCATION();
        else
            return null;
    }
}
