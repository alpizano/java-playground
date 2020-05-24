package org.example;

public class Defender {
    private String firstName;
    String lastName;
    private int age;
    private int birthYear;

    public void printName() {
        System.out.println("Hi, my name is " + firstName + lastName);
    }

    protected void printAge() {
        System.out.println("Hi, my age is " + age);
    }

    private void printBirthYear() {
        System.out.println("Hi, I was born in the year " + birthYear);
    }

}
