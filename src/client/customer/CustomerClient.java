package client.customer;

import common.Room;
import common.interfaces.ILogin;
import common.interfaces.IReservation;
import common.interfaces.IReturnView;
import common.reservation.Reservation;
import common.roles.Admin;
import common.roles.CUser;
import common.roles.PowerUser;
import common.users.Administrator;
import common.users.Customer;
import common.users.Employee;
import common.views.CustomerView;
import common.views.UserView;

import java.rmi.Naming;
import java.util.ArrayList;

public class CustomerClient {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer("Sean", "Livingston", new CUser("customer"));
            Administrator administrator = new Administrator("Nicole", "Livingston", new Admin("admin"));
            Employee employee = new Employee("Stephon", "Johnson", new PowerUser("Employee"));
            Room room = null;
            ArrayList<Room> rooms = new ArrayList<>();
            ArrayList<Room> reservedRooms = new ArrayList<>();
            Reservation reservation;

//            String location = "//in-csci-rrpc03:4590/ReservationImpl";
            String location = "rmi://localhost:4590/ReservationImpl";
            String loginLocation = "rmi://localhost:4590/LoginImpl";
//            String loginLocation = "//in-csci-rrpc03:4590/LoginImpl";

            IReservation reservationStub = (IReservation)Naming.lookup(location);
            ILogin loginStub = (ILogin)Naming.lookup(loginLocation);

            System.out.println("Contacting Server");
            System.out.println();

            System.out.println("Login status: " + loginStub.login(customer));
            System.out.println("Login status: " + loginStub.login(administrator));
            System.out.println("Login status: " + loginStub.login(employee));
            System.out.println();

            CustomerView view = (CustomerView) loginStub.login(customer);

            rooms = view.retrieveRooms();

            System.out.println("ROOMS AVAILABLE: ");
            if (!rooms.isEmpty()) {
                for (Room aRoom : rooms) {
                    System.out.println(aRoom.printRoomInformation());
                    System.out.println();
                }
            }
            System.out.println("END ROOMS AVAILABLE");
            System.out.println();

            System.out.println("RESERVATION: ");
            if (!rooms.isEmpty()) {
                room = rooms.get(1);
                reservation = reservationStub.reserve(room);
                System.out.println();
                System.out.println(reservation.getReservationDetails());
            }

            reservedRooms = view.retreiveReservedRooms();
            System.out.println();
            System.out.println("RESERVED ROOMS:");
            if (!reservedRooms.isEmpty()) {
                for (Room aRoom : reservedRooms) {
                    System.out.println(aRoom.printRoomInformation());
                    System.out.println();
                }
            }



            System.out.println();
            System.out.println("Reservation Status: " + reservationStub.cancel());



        } catch(Exception e) {
            System.out.println("Client err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
