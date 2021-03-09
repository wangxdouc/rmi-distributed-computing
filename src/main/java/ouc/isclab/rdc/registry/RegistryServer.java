package ouc.isclab.rdc.registry;

import ouc.isclab.rdc.util.ErrorCode;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

/**
 * Registry Server
 */
public class RegistryServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1100);
            registry.bind("REGISTRY", registry);
            RegistryAgent registryAgent = new RegistryAgentImpl();
            String registryName = "RA." + new Date().getTime();
            registry.bind(registryName, registryAgent);
            System.out.println("Registry server is running...");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
            System.exit(ErrorCode.REGISTRY_START_ERROR);
        }
    }
}