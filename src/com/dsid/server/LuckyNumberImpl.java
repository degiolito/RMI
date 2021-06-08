package com.dsid.server;

import java.rmi.RemoteException;

public class LuckyNumberImpl implements com.dsid.shared.LuckyNumber {

    private int luckyNumber = 100;

    @Override
    public String process(String value) throws RemoteException {
        int num;

        try {
            num = Integer.parseInt(value);
        } catch (Exception e){
            return "Please input a number!";
        }

        if(num == luckyNumber){
            return "FOII";
        }else {
            return "SOrry";
        }
    }
}
