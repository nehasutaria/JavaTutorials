package com.designPattern.abstractFactoryDP.example1;

public class BankFactory extends AbstractFactory {
    @Override
    Bank getFactory(String str) {
        if(str.equals("SBI"))
            return new SBI();
        else if(str.equals("ICICI"))
            return new ICICI();
        else
            return null;
    }
}
