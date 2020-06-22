package org.example.serialization;

import java.io.Serializable;

// Must implement Serializable to be serialized
public class Car implements Serializable {
    String make;
    String model;
    int year;
    // need for serializable
    private long serialVersionIUD = 69L;

    public Car(String make, String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }
}

