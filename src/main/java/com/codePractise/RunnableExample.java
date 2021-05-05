package com.codePractise;

public class RunnableExample {
    public static void main(String args[]){
        Thread myThread  = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread from Runnable");
            }
        });
        myThread.run();

        Thread lamdaThread = new Thread(() -> System.out.println("Thread from Lamada"));
        lamdaThread.run();

    }
}
