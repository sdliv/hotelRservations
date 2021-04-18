package common.controllers;

import common.users.Customer;
import common.views.CustomerView;
import common.views.UserView;
import hotel.ReservationImpl;

import java.rmi.RemoteException;


public class CustomerController extends Controller {
    private Customer customer;
    private ReservationImpl reservation;

    public CustomerController() throws RemoteException {
        super();
    }

    @Override
    public UserView returnView() throws RemoteException {
        return new CustomerView();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void makeReservation() {
        this.reservation.reserve();
    }

}
