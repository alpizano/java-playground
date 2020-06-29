package org.javamasterclassconcurrency.prodconsum;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    // Used by Consumer
    public synchronized String read() {
        // empty == true, when no message to read
        // read each message before writing another one
        while(empty) {
//            try {
//                // always call wait() within a loop
//                wait();
//            }
//            catch (InterruptedException e) {
//
//            }

        }

       // Set empty = true to signify message is read
        empty = true;
        // Conventional to use notifyAll
//        notifyAll();
        return message;
    }

    // Used by Producer
    public synchronized void write(String message) {
        // if not empty, loop until empty
        while(!empty) {
//            try {
//                wait();
//            }
//            catch(InterruptedException e) {
//
//            }

        }

        empty = false;
        this.message = message;
        // Conventional to use notifyAll
//        notifyAll();
    }
}

class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    public void run() {
        String messages[] = {"Humpty Dumpty sat on a wall ",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"};

        Random random = new Random();

        for(int i=0; i<messages.length; i++) {
            message.write(messages[i]);
            try {
                // Sleep for 2 secs after writing message
                Thread.sleep(random.nextInt(2000));
            }
            catch (InterruptedException e) {

            }
        }

        message.write("Finished");
    }
}

class Reader implements Runnable {
    private Message message;
    public Reader(Message message) {
        this.message = message;
    }

    public void run() {
        Random random = new Random();

        for(String latestMessage = message.read(); !latestMessage.equals("Finished");
            latestMessage  = message.read()) {
            System.out.println(latestMessage);
            try {
                // Sleep up to 2secs (randomly)
                Thread.sleep(random.nextInt(2000));
            }
            catch(InterruptedException e) {

            }
        }
    }
}