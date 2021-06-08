package com.dsid.client;

import com.dsid.shared.Calculadora;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculadoraCli {
    public static void main(String[] args) {
        try{
            Calculadora calculadora = (Calculadora) Naming.lookup("rmi://localhost:6666/CalculadoraService");
            System.out.println("Adição: " + calculadora.add(10, 15));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
