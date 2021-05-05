package com.designPattern.singletonDP;

public class SingleObjectLazy {
    public static SingleObjectLazy singleObject;  //Lazy Instation but not thread safe

    private SingleObjectLazy(){}

    public static SingleObjectLazy getInstance(){
        if(singleObject == null)
            singleObject = new SingleObjectLazy();
        return singleObject;
    }

}
