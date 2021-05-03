package common.reservation;

import common.Hotel;
import common.Room;

import java.util.ArrayList;
import java.util.Random;

public class CustomerReservationBuilder extends ReservationBuilder {

    public CustomerReservationBuilder(Room room) {
        super(room);
    }

    @Override
    public void addRoom(Room room) {
        reservationDetails.put("Room Details", room.printRoomInformation());
        Hotel.reserveRoom(room);
    }

    @Override
    public void addReservationNumber() {
        Random rand = new Random();
        int upperBound = 10000;
        int intRandom = rand.nextInt(upperBound);
        reservationDetails.put("Reservation Number", intRandom);
    }

    @Override
    public void createReservation() {
        Reservation reservation = new Reservation(reservationDetails);
    }


}
