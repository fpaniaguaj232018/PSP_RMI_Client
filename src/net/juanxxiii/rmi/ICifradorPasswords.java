package net.juanxxiii.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICifradorPasswords extends Remote {
    public String cifrarPassword(String password)
            throws RemoteException;
}
