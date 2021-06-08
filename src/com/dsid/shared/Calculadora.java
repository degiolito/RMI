package com.dsid.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculadora extends Remote {
    public long add(long v1, long v2) throws RemoteException;
}
