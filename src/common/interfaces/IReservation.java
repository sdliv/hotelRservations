package common.interfaces;

import common.Room;
import common.reservation.Reservation;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IReservation extends Remote {
    Reservation reserve(Room room) throws RemoteException;
    String cancel() throws RemoteException;
}
