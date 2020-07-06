package org.example;

import java.time.Instant;

public class Test {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        instant.toEpochMilli();

        System.out.println(instant.toEpochMilli());
        System.out.println((double)instant.toEpochMilli());


    }
}
