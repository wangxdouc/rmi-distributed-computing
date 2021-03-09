package ouc.isclab.rdc.slave;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 * SlaveAgent实现类
 */
public class SlaveAgentImpl extends UnicastRemoteObject implements SlaveAgent {

    public SlaveAgentImpl() throws RemoteException {
        super();
    }

    @Override
    public String hello() throws RemoteException {
        return this.toString();
    }

    @Override
    public void execute(List<String> taskList) throws RemoteException {
        // 此处拿到由Master分配的文本文件列表

    }
}