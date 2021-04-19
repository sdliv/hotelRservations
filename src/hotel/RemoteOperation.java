package hotel;

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

    public static void main (String[] args) {
        try {
            registry = LocateRegistry.createRegistry(4590);
            IReservation remote_obj = new ReservationImpl();
            ILogin login_obj = new LoginImpl();

            String location = "//in-csci-rrpc03:4590/ReservationImpl";
//            String location = "rmi://localhost/ReservationImpl";
//            String loginLocation = "rmi://localhost/LoginImpl";
            String loginLocation = "//in-csci-rrpc03:4590/LoginImpl";


            Naming.rebind(loginLocation, login_obj);
            Naming.rebind(location,remote_obj);
            System.out.println("Server Ready");
        } catch (Exception e) {
            System.out.println("Server err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
