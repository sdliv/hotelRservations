package common.views;

import common.Room;
import common.controllers.EmployerController;

import java.rmi.RemoteException;
import java.util.ArrayList;

public class EmployeeView extends UserView {

    private EmployerController employerController = new EmployerController();

    public EmployeeView() throws RemoteException {
    }


    @Override
    public ArrayList<Room> getRooms() {
        rooms = employerController.getAvailableRooms();
        return rooms;
    }
}
