package org.example.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) throws IOException {
        java.io.FileWriter locFile = new java.io.FileWriter("monkeybone.txt");
        locFile.write("Go to park \n On Fridays \n Sun is great \n Another Sentence");

        // Remember to close stream


    }

}
