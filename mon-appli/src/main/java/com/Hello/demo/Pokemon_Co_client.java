package com.Hello.demo;
import com.Hello.demo.Pokemon;
import java.rmi.*;

/**
 * Pokemon_Co_client
 */
public class Pokemon_Co_client {

    public static void main(String[] args) {
        try {
            Pokemon pika = (Pokemon)Naming.lookup("//localhost:11111/Pokemon_Naming");
            pika.clean();
            pika.drink();
            String test = pika.feed();
            System.out.println(test);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}