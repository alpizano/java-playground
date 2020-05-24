package org.example;

public class Attacker {

    public static void main(String[] args) {
        Defender defender = new Defender();

        // Can access PROTECTED method but not PRIVATE
        defender.printAge();
    }
}
