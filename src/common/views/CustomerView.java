package common.views;

import common.Hotel;
import common.Room;
import common.controllers.CustomerController;
import common.roles.CUser;
import common.users.Customer;
import hotel.ReservationImpl;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class CustomerView extends UserView {

    private CustomerController customerController = new CustomerController();

    public CustomerView() throws RemoteException {
        super();
    }

    public void printReservationDetails(Customer customer, ReservationImpl reservation) {
        Customer customer1 = new Customer("Sean", "Livingston", new CUser("Customer") );
    }

    public void makeReservation(Customer customer, Room room) {

    }

    @Override
    public ArrayList<Room> getRooms() {
        rooms = customerController.getAvailableRooms();
        return rooms;
    }
}
