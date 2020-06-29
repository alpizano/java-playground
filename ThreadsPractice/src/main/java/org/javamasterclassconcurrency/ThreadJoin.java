package org.javamasterclassconcurrency;

public class ThreadJoin {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Thread.currentThread().setName("Thread1");
            System.out.println("In Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Finished sleep of Thread1");
        });

        Thread t2 = new Thread(()-> {
            Thread.currentThread().setName("Thread2");
            System.out.println("In thread: " + Thread.currentThread().getName());
             //Joining on Thread1
            try {
                t1.join(3000); // using overloaded Timeout
                System.out.println("Thread1 terminated or timedout, so doing some work here inside of " + Thread.currentThread().getName());
            }
            catch(InterruptedException e) {
                System.out.println(e.getMessage());
            }

        });

        t1.start();
        t2.start();
        System.out.println("Inside of thread: " + Thread.currentThread().getName());
    }
}
