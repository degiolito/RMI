package com.dsid.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LuckyNumber extends Remote {
    String process(String value) throws RemoteException;
}
