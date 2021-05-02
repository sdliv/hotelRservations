package common.controllers;

import common.views.EmployeeView;
import common.views.UserView;

import java.rmi.RemoteException;

public class EmployerController extends Controller {

    public EmployerController() throws RemoteException {
        super();
    }

//    @Override
//    public UserView returnView() throws RemoteException {
//        return new EmployeeView();
//    }
}
