package Rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImp1 extends UnicastRemoteObject implements MyRemote {
    @Override
    public String sayHello() throws RemoteException {
        return "Server says,'Hey'";
    }
    public MyRemoteImp1() throws RemoteException { }
    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImp1() ;
            Naming.rebind("RemoteHello",service);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
