package ouc.isclab.rdc.slave;

import ouc.isclab.rdc.util.ErrorCode;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;

/**
 * Slave节点
 */
public class SlaveServer {
    public static void main(String[] args) {
        try {
            // 获取远程Registry
            Registry registry = LocateRegistry.getRegistry("localhost", 1100);
            // 创建一个远程对象
            SlaveAgent slaveAgent = new SlaveAgentImpl();
            // Slave名称加一个时间戳后缀，以区别每一个Slave
            String slaveName = "SA." + new Date().getTime();
            registry.bind(slaveName, slaveAgent);
            System.out.println("Slave server " + slaveName + " is running...");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
            System.exit(ErrorCode.SLAVE_START_ERROR);
        }
    }
}