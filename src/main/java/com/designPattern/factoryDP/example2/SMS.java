package com.designPattern.factoryDP.example2;

public class SMS implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS notification");
    }
}
