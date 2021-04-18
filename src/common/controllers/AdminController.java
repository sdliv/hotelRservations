package common.controllers;

import common.views.AdminView;
import common.views.UserView;

import java.rmi.RemoteException;

public class AdminController extends Controller {
    public AdminController() throws RemoteException {
    }

    @Override
    public UserView returnView() throws RemoteException {
        return new AdminView();
    }
}
