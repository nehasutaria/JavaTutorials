package com.designPattern.factoryDP.example2;

public class PushMsg implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Push Notification");
    }
}
