package org.example.MasterclassConcurrency;

public class ThreadInterrupt {


    public static void main(String[] args) throws InterruptedException {

        // Spin up new Thread
        Thread thread2 = new Thread(() -> System.out.println("Hi, I'm thread: " + Thread.currentThread().getName()));

        Thread thread3 = new Thread(() -> {
            System.out.println("Hi, I'm thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(5000);
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        );
        thread2.setName("SuperThread2");
        thread3.setName("SuperThread3");

        thread2.start();
        thread3.start();
        thread3.interrupt();

        System.out.println("Running in thread: " + Thread.currentThread().getName());


    }
}
