package common.reservation;

import java.util.HashMap;
import java.util.Map;

public class Reservation {

    private Map<String, Object> reservationDetails = new HashMap<>();

    public Reservation(Map<String, Object> reservationDetails) {
        this.reservationDetails = reservationDetails;
    }

    public Map<String, Object> getReservationDetails() {
        return reservationDetails;
    }

}
