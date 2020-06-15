package org.example.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args)  {
        FileWriter locFile = null;
        try {
            locFile = new FileWriter("monkeybone.txt");
            locFile.write("Go to park \n Go to house \n");

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("In finally block");
            try {
                if(locFile != null) {
                    // Have to handle IOException causes by attempting to clos stream
                    locFile.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Can force exception by creating a folder in /target directory same name of locFile


    }

}
