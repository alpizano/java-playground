package org.accessmodifiers;

public class Defender {
    private String firstName;
    String lastName;
    private int age;
    private int birthYear;

    public Defender() {
        firstName = "John";
        lastName = "Doe";
        age = 33;
        birthYear = 1987;
    }

    public void printName() {
        System.out.println("Hi, my name is " + firstName + lastName);
    }

    protected void printAge() {
        System.out.println("Hi, my age is " + age);
    }

    private void printBirthYear() {
        System.out.println("Hi, I was born in the year " + birthYear);
    }

    public static void main(String[] args) {
        Defender defender = new Defender();

        defender.printBirthYear();
    }

}
