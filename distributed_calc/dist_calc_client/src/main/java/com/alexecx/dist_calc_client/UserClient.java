package com.alexecx.dist_calc_client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.alexecx.dist_calculator.CalculatorImp;

/**
 * UserClient
 */
public class UserClient {

    public static void main(String[] args) {
        try {
            CalculatorImp calculator = (CalculatorImp) Naming.lookup("//localhost:8010/CalculatorImp");
            String result = calculator.add(2.0, 2.0);
            calculator.sub();
            calculator.mul();
            System.out.println(result);
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
    }
}