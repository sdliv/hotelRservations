package hotel;

import common.IReservation;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteReservation {

    static Registry registry;

    public static void main (String[] args) {
        try {
            registry = LocateRegistry.createRegistry(1099);
            IReservation remote_obj = new ReservationImpl();
            String location = "rmi://localhost/ReservationImpl";
            Naming.rebind(location,remote_obj);
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.out.println("Server err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
