package ouc.isclab.rdc.master;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MasterAgent extends Remote {
    String hello() throws RemoteException;
}