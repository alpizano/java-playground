package org.example.randomtests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // Read user input
        Scanner scanner = new Scanner(System.in);

        // Read a file
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Use Try with Resource, catch the IOException
                try(BufferedReader in = new BufferedReader(new FileReader("test.txt"))) {
                    String line;

                    while((line = in.readLine()) != null) {
                        System.out.println(line);
                    }
                }
                catch(IOException e) {
                    System.out.println(e.toString());
                }

            }
        });

        // Scanner is blocking; Cannot read file while is running, need to spawn new Thread
        while(scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        //int foo = scanner.nextInt();



        t1.start();

//        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
//        String line;
//
//        while((line = in.readLine()) != null) {
//            System.out.println(line);
//        }
    }
}
