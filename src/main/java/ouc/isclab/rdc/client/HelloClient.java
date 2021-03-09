package ouc.isclab.rdc.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;

/**
 * RMI客户端
 */
public class HelloClient {

    public static void main(String[] args) {
        try {
            String remoteAddr = "rmi://localhost:1100/REGISTRY";
            Registry registry = (Registry) Naming.lookup(remoteAddr);

            // 查询Registry上绑定的所有远程调用列表
            for (String service : registry.list()) {
                System.out.println(service);
            }

        } catch (NotBoundException | RemoteException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
