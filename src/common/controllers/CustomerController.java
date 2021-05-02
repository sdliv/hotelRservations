package common.controllers;

import common.Hotel;
import common.Room;
import common.users.Customer;
import common.views.CustomerView;
import common.views.UserView;
import hotel.ReservationImpl;

import java.rmi.RemoteException;
import java.util.ArrayList;


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

    public void makeReservation(Room room) {
        this.reservation.reserve(room);
    }

//    @Override
//    public ArrayList<Room> getAvailableRooms() {
//        return Hotel.getAvailableRooms();
//    }
}
