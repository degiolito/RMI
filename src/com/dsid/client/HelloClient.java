package com.dsid.client;

import com.dsid.shared.Hello;

import java.rmi.Naming;

public class HelloClient {
    static String message = "blank";
    static Hello obj = null;

    public static void main(String[] args) {
        try {
            obj = (Hello) Naming.lookup("//kvist.cs.umu.se/Hello");
            message = obj.hello();
            System.out.println("Mensagem no servidor RMI de \\"+ message + "\\");
        } catch (Exception e) {
            System.out.println("ERROR:: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
