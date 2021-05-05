package com.MultiThread;
class Test{
    int i;
    boolean flag = false;

    public synchronized void  setI(int i) throws InterruptedException {
        while (flag){
            wait();
        }
        this.i = i;
        System.out.println("Set : " + i);
        flag = true;
        notify();
    }
    public synchronized int getI() throws InterruptedException {
        while (!flag){
            wait();
        }
        System.out.println("Get : " + i);
        flag = false;
        notify();
        return i;

    }
}
class Producer implements Runnable{
    Test t;

    public Producer(Test t) {
        this.t = t;
        Thread t1 = new Thread(this, "producer");
        t1.start();
    }
    @Override
    public void run() {
        int i=0;
        while (true) {
            try {
                t.setI(i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try{Thread.sleep(500);}catch (Exception e){};
        }
    }
}
class Consumer implements Runnable{
    Test t;

    public Consumer(Test t) {
        this.t = t;
        Thread t2 = new Thread(this,"Consumer");
        t2.start();
    }

    @Override
    public void run() {
        while (true){
            try {
                t.getI();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try{Thread.sleep(3000);} catch (Exception e){};
        }
    }
}
public class ProducerConsumer {
    public static void main(String[] args){
        Test t = new Test();
        new Producer(t);
        new Consumer(t);

    }
}
