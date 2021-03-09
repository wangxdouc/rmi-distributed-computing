package ouc.isclab.rdc.master;

import ouc.isclab.rdc.util.ErrorCode;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

/**
 * Slave节点
 */
public class MasterServer {
    public static void main(String[] args) {
        try {
            // 获取远程Registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1100);
            // 创建一个远程对象
            MasterAgent masterAgent = new MasterAgentImpl();
            // Master名称加一个时间戳后缀
            String masterName = "MA." + new Date().getTime();
            registry.bind(masterName, masterAgent);

            System.out.println("Master server " + masterName + " is running...");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
            System.exit(ErrorCode.MASTER_START_ERROR);
        }
    }
}