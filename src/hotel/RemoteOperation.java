package hotel;

import common.Hotel;
import common.interfaces.ILogin;
import common.interfaces.IReservation;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteOperation {

    static Registry registry;
    private static Hotel hotel;

    public static void main (String[] args) {
        try {
            hotel = Hotel.getInstance();
            registry = LocateRegistry.createRegistry(4590);

            IReservation remote_obj = new ReservationImpl();
            ILogin login_obj = new LoginImpl();

//            String location = "//in-csci-rrpc03:4590/ReservationImpl";
            String location = "rmi://localhost:4590/ReservationImpl";
            String loginLocation = "rmi://localhost:4590/LoginImpl";
//            String loginLocation = "//in-csci-rrpc03:4590/LoginImpl";


            Naming.rebind(loginLocation, login_obj);
            Naming.rebind(location,remote_obj);
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.out.println("Server err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
