package com.alexecx.dist_calculator;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import com.alexecx.dist_calculator.CalculatorImp;

/**
 * CalcServer
 */
public class CalcServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(8008);
            CalculatorImp calculator = new CalculatorImp();
            System.out.println("created calculator");
            Naming.rebind("//localhost:8008/CalculatorImp", calculator);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        
        System.out.println("end");
    }
}