package common.interfaces;

import common.Room;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Map;

public interface IReservation extends Remote {
    Map<String, Object> reserve(Room room) throws RemoteException;
    String cancel() throws RemoteException;
}
