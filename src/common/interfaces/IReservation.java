package common.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IReservation extends Remote {
    String reserve() throws RemoteException;
    String cancel() throws RemoteException;
}
