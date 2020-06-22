package org.example.serialization;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("toyota", "camry", 2004);

        // Try w/ resources
        // ObjectOutputStream is for serializating Java objects
        try(ObjectOutputStream out = new FileOutputStream(new BufferedOutputStream(new FileOutputStream("car.dat")))) {
            out.writeObject(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
