package com.designPattern.singletonDP;

public class SingleObjectLazyThreadSafe {
    public static SingleObjectLazyThreadSafe obj;

    private SingleObjectLazyThreadSafe(){}

    public static synchronized SingleObjectLazyThreadSafe getInstance(){  //Thread safe but we can make it better by below code
        if(obj == null)
            obj = new SingleObjectLazyThreadSafe();
        return obj;
    }

    // Thread safe and also lock the method only one time when object is null -- best approach 
    /*public static  SingleObjectLazyThreadSafe getInstance(){
        if(obj == null){
            synchronized (SingleObjectLazyThreadSafe.class){
                if(obj == null )
                obj = new SingleObjectLazyThreadSafe();
            }
        }
        return obj;
    }*/

}
