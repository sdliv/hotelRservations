package common.controllers;

import common.Room;
import common.interfaces.IReservation;
import common.interfaces.IReturnView;
import common.views.UserView;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Controller extends UnicastRemoteObject implements IReturnView {

    public Controller() throws RemoteException {
    }

    public UserView returnView() throws RemoteException {
        return new UserView();
    }

    public ArrayList<Room> getAvailableRooms() {
        return null;
    }
}
