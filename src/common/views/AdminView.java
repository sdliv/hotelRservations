package common.views;

import common.Room;
import common.controllers.AdminController;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class AdminView extends UserView {

    private AdminController adminController = new AdminController();

    public AdminView() throws RemoteException {
    }

    @Override
    public ArrayList<Room> getRooms() {
        rooms = adminController.getAvailableRooms();
        return rooms;
    }
}
