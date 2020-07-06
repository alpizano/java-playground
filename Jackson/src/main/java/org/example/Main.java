package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main
{
    public static void main( String[] args ) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Person p1 = new Person(33,"Al", "Pizano");
        /**
         * Java Object -> Json
         */

        // Java object output as Json file
        objectMapper.writeValue(new File("person.json"), p1);

        // Java object to Json string
        String strP1  = objectMapper.writeValueAsString(p1);
        System.out.println(strP1);


        /**
         * Json -> Java Object
         */

        // Read in .json file into Java Object
        Person p3 = objectMapper.readValue(new URL("file:person.json"),Person.class);
        System.out.println(p3.toString());

        // Read in Json String into Java Object
        Person p2 = objectMapper.readValue(strP1, Person.class);
        System.out.println(p2.toString());

    }
}
