package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App
{
    public static void main( String[] args ) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        Person p1 = new Person(33,"Al", "Pizano");

        // Java object to Json string
        String strP1  = objectMapper.writeValueAsString(p1);

        System.out.println(strP1);

    }
}
