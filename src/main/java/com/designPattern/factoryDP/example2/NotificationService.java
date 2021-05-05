package com.designPattern.factoryDP.example2;

public class NotificationService {

    public static void main(String[] args){
        NotificationFactory nf = new NotificationFactory();
        Notification nfType = nf.createNotificationType("PUSH");
        nfType.notifyUser();
    }



}
