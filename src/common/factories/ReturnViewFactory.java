package common.factories;

import common.controllers.AdminController;
import common.controllers.CustomerController;
import common.controllers.EmployerController;

import java.rmi.RemoteException;

// Implementation of Factory

public class ReturnViewFactory {
    public IReturnView returnView(String roleName) throws RemoteException {

        if (roleName.equals("customer")) {
            return new CustomerController();
        }

        if (roleName.equals("admin")) {
            return new AdminController();
        }

        if (roleName.equals("employee")) {
            return new EmployerController();
        }

        return null;
    }
}
