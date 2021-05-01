package common.views;

import common.Room;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class UserView implements Serializable {

    ArrayList<Room> rooms = new ArrayList<>();

    public UserView() throws RemoteException {
        super();
    }

    public UserView returnView() {
        return null;
    }

    public ArrayList<Room> getRooms() {
        return null;
    }
}
