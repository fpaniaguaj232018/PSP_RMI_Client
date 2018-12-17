package net.juanxxiii.rmi;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ejecutador {
    static ICifradorPasswords cifrador = null;
    public static void main(String[] args) {
        try {
            Registry registro =
                    LocateRegistry.getRegistry("localhost",5555);
            cifrador = (ICifradorPasswords)registro.lookup("benzema");
            System.out.println("BENZEMA ENCONTRADO");
            String claveCifrada = cifrador.cifrarPassword("PANIAGUA");
            System.out.println("CLAVE CIFRADA:" + claveCifrada);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
   
}
