package org.example2;

import org.example.Defender;

public class OutsideAttacker {
    public static void main(String[] args) {
        Defender defender = new Defender();

        // Can only access PUBLIC method from "example" package. No access to PROTECTED
        defender.printName();
    }

}
