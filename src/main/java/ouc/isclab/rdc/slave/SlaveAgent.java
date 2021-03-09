package ouc.isclab.rdc.slave;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface SlaveAgent extends Remote {
    String hello() throws RemoteException;
    void execute(List<String> taskList) throws RemoteException;
}