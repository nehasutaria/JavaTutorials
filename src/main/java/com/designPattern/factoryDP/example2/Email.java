package com.designPattern.factoryDP.example2;

public class Email implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Email notification");
    }
}
