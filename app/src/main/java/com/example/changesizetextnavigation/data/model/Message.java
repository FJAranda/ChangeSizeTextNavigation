package com.example.changesizetextnavigation.data.model;

import java.io.Serializable;

public class Message implements Serializable {

    private String message;
    private int size;

    public Message(String message, int size) {
        this.message = message;
        this.size = size;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
