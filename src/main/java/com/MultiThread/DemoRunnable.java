package com.MultiThread;

public class DemoRunnable {

    public static void main(String[] args){

        Thread t1 = new Thread(()->{
            for(int i=0; i<5;i++)
                System.out.println("Neha");
        });
        Thread t2 = new Thread(()->{
            for(int i=0; i<5;i++)
                System.out.println("Riya");});

        t1.start();
        t2.start();

    }
}
