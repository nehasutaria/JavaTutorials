package com.MultiThread;

public class RunnableDemo implements Runnable{
    public int count=0;

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            count++;
        }

        System.out.println("Count" + count);
    }
    public static void main(String[] args){
        RunnableDemo thread = new RunnableDemo();
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        //System.out.println("Before Thread" + count);
        t1.start();

        t2.start();
       // System.out.println("After Thread" + count);
    }
}
