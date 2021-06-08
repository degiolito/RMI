package com.dsid.server;

import com.dsid.shared.Calculadora;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl implements Calculadora {

    @Override
    public long add(long v1, long v2) throws RemoteException {
        return v1+v2;
    }

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(6666);

        CalculadoraImpl calculadoraImpl = new CalculadoraImpl();
        Calculadora calculadora = (Calculadora) UnicastRemoteObject.exportObject(calculadoraImpl, 0);

        registry.rebind("calc", calculadora);

        System.out.println("Der Server ist lauft..");

    }
}
