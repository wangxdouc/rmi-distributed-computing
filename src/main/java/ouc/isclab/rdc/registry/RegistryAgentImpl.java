package ouc.isclab.rdc.registry;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RegistryAgentImpl extends UnicastRemoteObject implements RegistryAgent {

    public RegistryAgentImpl() throws RemoteException {
        super();
    }

    @Override
    public String hello() throws RemoteException {
        return "[REGISTRY] Hello! ";
    }
}