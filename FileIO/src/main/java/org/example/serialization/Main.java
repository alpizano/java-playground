package org.example.serialization;

import java.io.*;
import java.nio.Buffer;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("toyota", "camry", 2004);

        // Try w/ resources
        // ObjectOutputStream is for serializing Java objects
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("car.dat")))) {
            out.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("car.dat")))) {
            boolean eof = false;
            while (!eof) {
                try {
                    // Need to cast Object to Car (Narrowing)
                    Car car2 = (Car) in.readObject();
                    System.out.println(car2.make + " " +  car2.model + " " + car2.year);
                }
                catch(EOFException e) {
                    eof = true;
                    System.out.println(e.getMessage());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
