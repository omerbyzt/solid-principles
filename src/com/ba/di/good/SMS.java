package com.ba.di.good;

public class SMS implements Message {

    @Override
    public void sendMessage() {
        sendSMS();
    }

    private void sendSMS() {
        //Send sms
    }
}
