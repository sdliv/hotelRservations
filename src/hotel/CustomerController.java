package hotel;

import common.Customer;

import java.rmi.RemoteException;


public class CustomerController {
    private Customer customer;
    private ReservationImpl reservation;

    public CustomerController() {
        try {
            this.reservation = new ReservationImpl();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
