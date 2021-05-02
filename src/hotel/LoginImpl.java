package hotel;

import common.controllers.AdminController;
import common.controllers.CustomerController;
import common.controllers.EmployerController;
import common.interfaces.ILogin;
import common.operations.HotelOperationExecutor;
import common.operations.LoginOperation;
import common.roles.Admin;
import common.roles.CUser;
import common.roles.PowerUser;
import common.users.Customer;
import common.users.Person;
import common.views.ErrorView;
import common.views.UserView;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoginImpl extends UnicastRemoteObject implements ILogin {

    HotelOperationExecutor hotelOperationExecutor = new HotelOperationExecutor();

    public LoginImpl() throws RemoteException {
        super();
    }

    @Override
    public UserView login(Person user) throws RemoteException {

        if (hotelOperationExecutor.executeOperation(new LoginOperation(user)) instanceof Admin) {
            AdminController adminController = new AdminController();
        }

        if (hotelOperationExecutor.executeOperation(new LoginOperation(user)) instanceof PowerUser) {
            EmployerController employerController = new EmployerController();
            return employerController.returnView();
        }

        if (hotelOperationExecutor.executeOperation(new LoginOperation(user)) instanceof CUser) {
            CustomerController customerController = new CustomerController();
            return customerController.returnView();
        }

//        if (user.getRole() instanceof Admin) {
//            AdminController adminController = new AdminController();
//            return adminController.returnView();
//        }
//
//        if (user.getRole() instanceof PowerUser) {
//            EmployerController employerController = new EmployerController();
//            return employerController.returnView();
//        }
//
//        if (user.getRole() instanceof CUser) {
//            CustomerController customerController = new CustomerController();
//            return customerController.returnView();
//        }
        return new ErrorView();
    }
}
