package org.javamultithreadconcurrperfopt;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a new Thread object
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Code that will run in new thread
                System.out.println("We are now in thread: " + Thread.currentThread().getName() + " with priority: " + Thread.currentThread().getPriority());
            }
        });

        t1.setName("My First Thread");

        // Value ranges from 1 to 10 to set static component of dynamic priority dynamically
        t1.setPriority(Thread.MAX_PRIORITY);

         //Using Java8 lambda
        Thread t2 = new Thread(() -> {

        });

        System.out.println("We are in thread: " + Thread.currentThread().getName() + " before starting a new thread");
        t1.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName() + " after starting a new thread");

        Thread.sleep(10000);
    }
}
