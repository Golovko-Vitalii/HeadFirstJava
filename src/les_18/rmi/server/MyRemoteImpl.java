package les_18.rmi.server;

import les_18.rmi.MyRemote;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    public MyRemoteImpl() throws RemoteException {}
    public String sayHello(){
        return "Server say: 'Hello'";
    }
    public static void main(String[]args){
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote_Hello", service);
        }catch(Exception ex){ex.printStackTrace();}
    }
}
