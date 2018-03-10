package les_18.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {
    static final long serialVersionUID = 3235235L;
    public String sayHello() throws RemoteException;
}
