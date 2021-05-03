package common.factories;

import common.views.UserView;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Interface for Factory method

public interface IReturnView extends Remote {
    UserView returnView() throws RemoteException;
}
