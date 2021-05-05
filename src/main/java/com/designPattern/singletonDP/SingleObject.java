package com.designPattern.singletonDP;

public class SingleObject {
    public static SingleObject instance = new SingleObject();   // Eagar instation

    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }

}
