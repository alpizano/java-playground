package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class App
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



    }
}
