package com.designPattern.singletonDP;

public class Demo {
    public static void main(String[] args){
        SingleObject obj = SingleObject.getInstance();
        obj.showMessage();
    }
}
