package common.controllers;

import common.interfaces.IReturnView;
import common.views.UserView;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Controller extends UnicastRemoteObject implements IReturnView {

    public Controller() throws RemoteException {
    }

    public UserView returnView() throws RemoteException {
        return new UserView();
    }
}
