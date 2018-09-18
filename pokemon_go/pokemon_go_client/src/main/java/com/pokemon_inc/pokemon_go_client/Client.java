package com.pokemon_inc.pokemon_go_client;

import java.rmi.Naming;

import com.pokemon_inc.pokemon_go_server.Pokemon;
/**
 * Client
 */
public class Client {

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