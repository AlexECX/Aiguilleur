package com.Hello.demo;
import java.io.IOException;

import com.Hello.demo.Client;
import com.Hello.demo.Server;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Client client = new Client("127.0.0.1", 8008);
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("end client");


        
        
    }
}