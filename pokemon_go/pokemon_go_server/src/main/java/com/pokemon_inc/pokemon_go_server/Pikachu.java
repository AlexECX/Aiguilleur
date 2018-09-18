package com.pokemon_inc.pokemon_go_server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Pikachu
 */
public class Pikachu extends UnicastRemoteObject implements Pokemon {

    private static final long serialVersionUID = -810734175496963103L;

    public Pikachu() throws RemoteException {
    }

    public String feed() throws RemoteException {
        String str = "feed Pikachu";
        return str;
    }

    public void clean() throws RemoteException {
        System.out.println("clean Pikachu");
        System.out.println("clean Pikachu");
        System.out.println("clean Pikachu");
        System.out.println("clean Pikachu");
        System.out.println("clean Pikachu");
    }

    public void drink() throws RemoteException {
        System.out.println("drink Pikachu");
	}

    
}