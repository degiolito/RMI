package com.dsid.server;

import com.dsid.shared.LuckyNumber;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Main {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(6666);

        LuckyNumberImpl luckyNumberImpl = new LuckyNumberImpl();
        LuckyNumber luckyNumber = (LuckyNumber) UnicastRemoteObject.exportObject(luckyNumberImpl, 0);

        registry.rebind("lucky", luckyNumber);

        System.out.println("Server is runnig");
    }
}
