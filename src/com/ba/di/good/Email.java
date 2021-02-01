package com.ba.di.good;

public class Email implements Message {

    @Override
    public void sendMessage() {
        sendEmail();
    }

    private void sendEmail() {
        //Send email
    }
}
