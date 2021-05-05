package com.designPattern.factoryDP.example2;

public class NotificationFactory {
    public Notification createNotificationType(String str){
        if(null == str)
            return null;
        else if("SMS".equals(str))
            return new SMS();
        else if("EMAIL".equals(str))
            return new Email();
        else if("PUSH".equals(str))
            return new PushMsg();
        else
            return null;
    }
}
