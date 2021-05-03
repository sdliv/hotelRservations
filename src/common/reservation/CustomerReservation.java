package common.reservation;

import java.util.Map;

// Concrete class of template method.

public class CustomerReservation extends Reservation {
    public CustomerReservation(Map<String, Object> reservationDetails) {
        super(reservationDetails);
    }
}
