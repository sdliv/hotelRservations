package hotel;

import common.Hotel;
import common.Room;
import common.controllers.Controller;
import common.interfaces.ILogin;
import common.interfaces.IReservation;
import common.interfaces.IReturnView;
import common.interfaces.IView;
import common.views.UserView;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteOperation {

    static Registry registry;
    private static Hotel hotel;

    public static void main (String[] args) {
        try {
            registry = LocateRegistry.createRegistry(4590);
            IReservation remote_obj = new ReservationImpl();
            ILogin login_obj = new LoginImpl();

            // Create Hotel Rooms
            Room roomOne = new Room(4, 2, false, true, "Nice and large room", 255, 150.00 );
            Room roomTwo = new Room(5, 1, false, true, "Single Luxurious Room", 124, 200.00 );
            Room roomThree = new Room(3, 2, false, true, "Chaper Room, Less Space", 214, 100.00 );

            hotel.addRoom(roomOne);
            hotel.addRoom(roomTwo);
            hotel.addRoom(roomThree);

//            String location = "//in-csci-rrpc03:4590/ReservationImpl";
            String hotelLocation = "rmi://localhost:4590/Hotel";
            String location = "rmi://localhost:4590/ReservationImpl";
            String loginLocation = "rmi://localhost:4590/LoginImpl";
//            String loginLocation = "//in-csci-rrpc03:4590/LoginImpl";


            Naming.rebind(loginLocation, login_obj);
            Naming.rebind(location,remote_obj);
            Naming.rebind(hotelLocation, hotel);
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.out.println("Server err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
