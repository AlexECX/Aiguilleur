package com.Hello.demo;
import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import com.Hello.demo.Pikachu;

/**
 * Pokemon_Go
 */
public class Pokemon_Go {

    public static void main(String[] args) {
        try {
           
            LocateRegistry.createRegistry(11111);
            Pikachu pika = new Pikachu();
            System.out.println("created pika");
            try {
                Naming.rebind("//localhost:11111/Pokemon_Naming", pika);
            } catch (MalformedURLException e) {
                System.out.println("malformed");
                System.out.println(e);
            }
            


        } catch (RemoteException e) {
            System.out.println("remote");
            System.out.println(e);
        }
        
    }
}