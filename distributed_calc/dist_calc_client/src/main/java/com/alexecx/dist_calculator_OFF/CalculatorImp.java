package com.alexecx.dist_calculator;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import com.alexecx.dist_calculator.Calculator;

/**
 * CalculatorImp
 */
public class CalculatorImp extends UnicastRemoteObject implements Calculator {

    private static final long serialVersionUID = 1726736791258617427L;

    public CalculatorImp() throws RemoteException {
    }

    public String add(double x, double y) throws RemoteException {
        double result = x + y;
        return Double.toString(result);
    }

    public void sub() throws RemoteException {
        System.out.println("sub");
    }

    public void mul() throws RemoteException {
        System.out.println("mul");
    }

    
}