package hotel;

import common.controllers.AdminController;
import common.controllers.CustomerController;
import common.controllers.EmployerController;
import common.interfaces.ILogin;
import common.roles.Admin;
import common.roles.CUser;
import common.roles.PowerUser;
import common.users.Person;
import common.views.ErrorView;
import common.views.UserView;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoginImpl extends UnicastRemoteObject implements ILogin {
    public LoginImpl() throws RemoteException {
        super();
    }

    @Override
    public UserView login(Person user) throws RemoteException {

        if (user.getRole() instanceof Admin) {
            AdminController adminController = new AdminController();
            return adminController.returnView();
        }

        if (user.getRole() instanceof PowerUser) {
            EmployerController employerController = new EmployerController();
            return employerController.returnView();
        }

        if (user.getRole() instanceof CUser) {
            CustomerController customerController = new CustomerController();
            return customerController.returnView();
        }
        return new ErrorView();
    }
}
