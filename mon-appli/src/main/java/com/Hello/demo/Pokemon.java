package com.Hello.demo;
import java.rmi.*;


/**
 * Pokemon
 */
public interface Pokemon extends Remote{

    public String feed() throws RemoteException;

    public void clean() throws RemoteException;

    public void drink() throws RemoteException;
}