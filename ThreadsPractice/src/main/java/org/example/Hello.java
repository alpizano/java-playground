package org.example;

public class Hello {
    public static void main(String[] args) throws InterruptedException {
        // Create a new Thread object
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Code that will run in new thread
                System.out.println("We are now in thread: " + Thread.currentThread().getName());
            }
        });

         //Using Java8 lambda
        Thread t2 = new Thread(() -> {

        });

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        t1.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");

        Thread.sleep(10000);
    }
}
