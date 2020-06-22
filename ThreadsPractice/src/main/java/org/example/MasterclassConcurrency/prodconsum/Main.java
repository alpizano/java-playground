package org.example.MasterclassConcurrency.prodconsum;

public class Main {
    public static void main(String[] args) {

    }
}

class Message {
    private String message;
    private boolean empty = true;

    // Used by Consumer
    public synchronized String read() {
        while(empty) {

        }
        empty = true;
        return message;
    }

    public synchronized void write(String message) {
        while(!empty) {

        }
        empty = false;
        this.message = message;
    }
}
