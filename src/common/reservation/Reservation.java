package common.reservation;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

// Base class for template method.

public class Reservation implements Serializable {

    private Map<String, Object> reservationDetails = new HashMap<>();

    public Reservation(Map<String, Object> reservationDetails) {
        this.reservationDetails = reservationDetails;
    }

    public Map<String, Object> getReservationDetails() {
        return reservationDetails;
    }

}
