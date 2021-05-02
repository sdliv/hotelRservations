package common.reservation;

import common.Room;

import java.util.HashMap;
import java.util.Map;

public abstract class ReservationBuilder {

    protected Map<String, Object> reservationDetails = new HashMap<>();
    protected Room room;

    public final Reservation buildReservation() {
        addRoom(this.room);
        createReservation();
        return getReservation();
    }

    public abstract void addRoom(Room room);
    public abstract void addReservationNumber();
    public abstract void createReservation();

    private Reservation getReservation() {
        return new Reservation(reservationDetails);
    }
}
