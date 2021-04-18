package common.interfaces;

import common.views.UserView;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IView extends Remote {
    UserView returnView() throws RemoteException;
}
