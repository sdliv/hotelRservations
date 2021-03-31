package client;

import common.IReservation;

import java.rmi.Naming;

public class CustomerClient {
    public static void main(String[] args) {
        try {
//            String location = "//in-csci-rrpc01:2324/ReservationImpl";
            String location = "rmi://localhost/ReservationImpl";
            IReservation stub = (IReservation)Naming.lookup(location);
            System.out.println("Contacting Server");
            System.out.println("Reservation Status: " + stub.reserve());
            System.out.println("Reservation Status: " + stub.cancel());

        } catch(Exception e) {
            System.out.println("Client err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
