package org.example.randomtests.httpcallable;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new HttpTest1());

        t1.start();
    }
}
