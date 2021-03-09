package ouc.isclab.rdc.master;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * SlaveAgent实现类
 */
public class MasterAgentImpl extends UnicastRemoteObject implements MasterAgent {

    public MasterAgentImpl() throws RemoteException {
        super();
    }

    @Override
    public String hello() throws RemoteException {
        return this.toString();
    }
}