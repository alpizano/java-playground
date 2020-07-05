package org.example.randomtests.httpcallable;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HttpTest1Runnable());

        t1.start();
    }
}
