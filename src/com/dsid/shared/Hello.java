package com.dsid.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello extends Remote {
    String hello() throws RemoteException;
}
