package hotel;

import common.interfaces.IReservation;
import common.Room;
import common.reservation.CustomerReservationBuilder;
import common.reservation.Reservation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ReservationImpl extends UnicastRemoteObject implements IReservation {
    private boolean cancellationStatus;
    private double feeApplied;
    private Room room;
    private ArrayList<Room> rooms = new ArrayList<>();

    public ReservationImpl() throws RemoteException {
        super();
    }

    @Override
    public Reservation reserve(Room room) {
        CustomerReservationBuilder customerReservationBuilder = new CustomerReservationBuilder(room);
        Reservation reservation = customerReservationBuilder.buildReservation();



        System.out.println("Hotel Reserved");
        return reservation;
    }

    @Override
    public String cancel() {
        System.out.println("Hotel Reservation Canceled");
        return "Hotel Reservation Canceled";
    }
}
