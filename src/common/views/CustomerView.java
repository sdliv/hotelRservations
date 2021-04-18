package common.views;

import common.roles.CUser;
import common.users.Customer;
import hotel.ReservationImpl;

import java.rmi.RemoteException;

public class CustomerView extends UserView {
    public CustomerView() throws RemoteException {
        super();
    }

    public void printReservationDetails(Customer customer, ReservationImpl reservation) {
        Customer customer1 = new Customer("Sean", "Livingston", new CUser("Customer") );
    }
}
