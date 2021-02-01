package com.ba.di.good;

import java.util.List;

class Notification {

    private List<Message> messages;

    public Notification(List<Message> messages) {
        this.messages = messages;
    }

    public void sender() {
        for (Message message : messages) {
            message.sendMessage();
        }
    }
}
