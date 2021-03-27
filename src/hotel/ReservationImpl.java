package hotel;

import common.IReservation;
import common.Room;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ReservationImpl extends UnicastRemoteObject implements IReservation {
    private boolean cancellationStatus;
    private double feeApplied;
    private Room room;

    public ReservationImpl() throws RemoteException {
        super();
    }

    @Override
    public String reserve() {
        System.out.println("Hotel Reserved");
        return "Hotel Reserved";
    }

    @Override
    public String cancel() {
        System.out.println("Hotel Reservation Canceled");
        return "Hotel Reservation Canceled";
    }
}
