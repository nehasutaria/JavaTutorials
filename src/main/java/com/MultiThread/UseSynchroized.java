package com.MultiThread;
class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }

}
public class UseSynchroized {
    public static void main(String[] args) throws InterruptedException {
        Counter cnt = new Counter();
        Thread t1 = new Thread(() -> {
            for(int i=0; i<2000; i++)
            cnt.increment();
        });
        Thread t2 = new Thread(() -> {
            for(int i=0; i<2000; i++)
                cnt.increment();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Count : "+ cnt.count);
    }

}

