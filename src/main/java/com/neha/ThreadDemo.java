package com.neha;

import java.util.stream.IntStream;

class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }

}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                IntStream.rangeClosed(1, 500).forEach(i -> c.increment());
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=500;i++) {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);

    }

}
