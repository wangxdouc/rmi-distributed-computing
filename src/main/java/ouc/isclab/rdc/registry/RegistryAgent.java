package ouc.isclab.rdc.registry;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RegistryAgent extends Remote {
    String hello() throws RemoteException;
}