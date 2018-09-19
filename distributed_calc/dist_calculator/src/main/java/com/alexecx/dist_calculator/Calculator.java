package com.alexecx.dist_calculator;
import java.rmi.*;


/**
 * Calculator
 */
public interface Calculator extends Remote{

    public String add(double x, double y) throws RemoteException;

    public void sub() throws RemoteException;

    public void mul() throws RemoteException;
}