package com.pokemon_inc.pokemon_go_server;
import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import com.pokemon_inc.pokemon_go_server.Pikachu;

/**
 * Server
 */
public class Server {

    public static void main(String[] args) {
        try {
            //System.setSecurityManager(new RMISecurityManager()); depreciated?
            LocateRegistry.createRegistry(8009);
            Pikachu pika = new Pikachu();
            System.out.println("created pika");
            try {
                Naming.rebind("//localhost:8009/Pokemon_Naming", pika);
            } catch (MalformedURLException e) {
                System.out.println("malformed");
                System.out.println(e);
            }
            


        } catch (RemoteException e) {
            System.out.println("remote");
            System.out.println(e);
        }
        System.out.println("end");
    }
}