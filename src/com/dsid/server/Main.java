package com.dsid.server;

import com.dsid.shared.Calculadora;
import com.dsid.shared.LuckyNumber;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(6666);

        CalculadoraImpl calculadoraImpl = new CalculadoraImpl();
        Calculadora calculadora = (Calculadora) UnicastRemoteObject.exportObject(calculadoraImpl, 0);

        registry.rebind("calc", calculadora);

        LuckyNumberImpl luckyNumberImpl = new LuckyNumberImpl();
        LuckyNumber luckyNumber = (LuckyNumber) UnicastRemoteObject.exportObject(luckyNumberImpl, 0);

        registry.rebind("lucky", luckyNumber);

        System.out.println("Server is runnig");
    }
}
