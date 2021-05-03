package client.customer;

import common.Room;
import common.interfaces.ILogin;
import common.interfaces.IReservation;
import common.reservation.Reservation;
import common.roles.Admin;
import common.roles.CUser;
import common.roles.PowerUser;
import common.users.Administrator;
import common.users.Customer;
import common.users.Employee;
import common.views.CustomerView;

import java.rmi.Naming;
import java.util.ArrayList;

public class CustomerClient {
    public static void main(String[] args) {
        try {

            // Create User Objects
            Customer customer = new Customer("Sean", "Livingston", new CUser("customer"));
            Administrator administrator = new Administrator("Nicole", "Livingston", new Admin("admin"));
            Employee employee = new Employee("Stephon", "Johnson", new PowerUser("employee"));

            // Create Reservation and Room Objects
            Room room = null;
            ArrayList<Room> rooms = new ArrayList<>();
            ArrayList<Room> reservedRooms = new ArrayList<>();
            Reservation reservation;

            // RMI Locations
            String location = "//old.in-csci-rrpc03:4590/ReservationImpl";
//            String location = "rmi://localhost:4590/ReservationImpl";
//            String loginLocation = "rmi://localhost:4590/LoginImpl";
            String loginLocation = "//old.in-csci-rrpc03:4590/LoginImpl";

            // Create Stubs
            IReservation reservationStub = (IReservation)Naming.lookup(location);
            ILogin loginStub = (ILogin)Naming.lookup(loginLocation);

            System.out.println("Contacting Server");
            System.out.println();

            // Use loginStub to return a view based on type of User
            System.out.println("Login status: " + loginStub.login(customer));
            System.out.println("Login status: " + loginStub.login(administrator));
            System.out.println("Login status: " + loginStub.login(employee));
            System.out.println();

            // Create variable that grabs the customer View
            CustomerView view = (CustomerView) loginStub.login(customer);

            // Retrieves list of available Rooms.
            rooms = view.retrieveRooms();

            // Prints all Rooms Available
            System.out.println("ROOMS AVAILABLE: ");
            if (!rooms.isEmpty()) {
                for (Room aRoom : rooms) {
                    System.out.println(aRoom.printRoomInformation());
                    System.out.println();
                }
            }
            System.out.println("END ROOMS AVAILABLE");
            System.out.println();

            // Reserves a Room and prints the Reservation Details.
            System.out.println("RESERVATION: ");
            if (!rooms.isEmpty()) {
                room = rooms.get(1);
                reservation = reservationStub.reserve(room);
                System.out.println();
                System.out.println(reservation.getReservationDetails());
            }

            //  Retrieves reserved Rooms.
            reservedRooms = view.retreiveReservedRooms();
            System.out.println();
            System.out.println("RESERVED ROOMS:");
            if (!reservedRooms.isEmpty()) {
                for (Room aRoom : reservedRooms) {
                    System.out.println(aRoom.printRoomInformation());
                    System.out.println();
                }
            }


            // Cancels Reservation stub.
            System.out.println();
            System.out.println("Reservation Status: " + reservationStub.cancel());



        } catch(Exception e) {
            System.out.println("Client err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
