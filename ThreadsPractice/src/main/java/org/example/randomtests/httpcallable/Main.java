package org.example.randomtests.httpcallable;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HttpGet());

        t1.start();
    }
}
