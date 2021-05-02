package client.customer;

import common.interfaces.ILogin;
import common.interfaces.IReservation;
import common.interfaces.IReturnView;
import common.roles.Admin;
import common.roles.CUser;
import common.roles.PowerUser;
import common.users.Administrator;
import common.users.Customer;
import common.users.Employee;
import common.views.CustomerView;
import common.views.UserView;

import java.rmi.Naming;

public class CustomerClient {
    public static void main(String[] args) {
        try {
            Customer customer = new Customer("Sean", "Livingston", new CUser("customer"));
            Administrator administrator = new Administrator("Nicole", "Livingston", new Admin("admin"));
            Employee employee = new Employee("Stephon", "Johnson", new PowerUser("Employee"));

//            String location = "//in-csci-rrpc03:4590/ReservationImpl";
            String location = "rmi://localhost:4590/ReservationImpl";
            String loginLocation = "rmi://localhost:4590/LoginImpl";
//            String loginLocation = "//in-csci-rrpc03:4590/LoginImpl";

            IReservation stub = (IReservation)Naming.lookup(location);
            ILogin loginStub = (ILogin)Naming.lookup(loginLocation);

            System.out.println("Contacting Server");
            System.out.println("Reservation Status: " + stub.reserve());
            System.out.println("Reservation Status: " + stub.cancel());

//            CustomerView view = (CustomerView) loginStub.login(customer);
//            customer.setView(view);


            System.out.println("Login status: " + loginStub.login(customer));
            System.out.println("Login status: " + loginStub.login(administrator));
            System.out.println("Login status: " + loginStub.login(employee));


        } catch(Exception e) {
            System.out.println("Client err: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
