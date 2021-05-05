package com.MultiThread;

class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}
class Hello extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
class HiHello implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("HiHello");
        }
    }
}
public class ThreadDemo {
        public static void main(String[] arg){
            Hi hi = new Hi();
            Hello hello = new Hello();
            HiHello hiHello = new HiHello();

            Thread t1 = new Thread(hiHello);

            Runnable r1 = () -> System.out.println("Neha");
            Thread t2 = new Thread(r1);

            Runnable r2 = () -> {
                for (int i=1; i<5; i++) {
                    System.out.println("Riya");
                }
            };
            Thread t3 = new Thread(r2);


            hi.start();
            hello.start();
            t1.start();
            t2.start();
            t3.start();

    }
}
