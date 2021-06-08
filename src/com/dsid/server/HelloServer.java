package com.dsid.server;

import com.dsid.shared.Hello;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloServer extends UnicastRemoteObject implements Hello {
    protected HelloServer() throws RemoteException {
        super();
    }

    @Override
    public String hello() throws RemoteException {
        System.out.println("Invocation to Hello was successful!");
        return "Hello World from RMI server!";
    }

    public static void main(String[] args) {
        try {
            HelloServer obj = new HelloServer();

            Naming.rebind("Hello", obj);
            System.out.println("Ligado no registry");
        } catch (Exception e){
            System.out.println("ERROR:: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
