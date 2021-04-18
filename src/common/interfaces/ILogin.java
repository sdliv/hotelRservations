package common.interfaces;

import common.users.Person;
import common.views.UserView;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ILogin extends Remote {
    UserView login(Person user) throws RemoteException;
}
