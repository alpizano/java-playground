package org.example;

public class Person {
    private int age;
    private String firstName;
    private String lastName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person() {
        age = 0;
        firstName = "";
        lastName = "";
    }

    public Person(int age, String firstName, String lastName) {
        this.age=age;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "Person is " + age + " with firstname: " + firstName + " and lastname " + lastName;
    }
}
