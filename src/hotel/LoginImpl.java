package hotel;

import common.Hotel;
import common.controllers.AdminController;
import common.controllers.CustomerController;
import common.controllers.EmployerController;
import common.factories.IReturnView;
import common.factories.ReturnViewFactory;
import common.interfaces.ILogin;
import common.operations.HotelOperationExecutor;
import common.operations.LoginOperation;
import common.roles.Admin;
import common.roles.CUser;
import common.roles.PowerUser;
import common.roles.Role;
import common.users.Customer;
import common.users.Person;
import common.views.ErrorView;
import common.views.UserView;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoginImpl extends UnicastRemoteObject implements ILogin {

    HotelOperationExecutor hotelOperationExecutor = new HotelOperationExecutor();



    public LoginImpl() throws RemoteException {
        super();
        Hotel hotel = Hotel.getInstance();
        System.out.println();
    }

    @Override
    public UserView login(Person user) throws RemoteException {


        Role role = hotelOperationExecutor.executeOperation(new LoginOperation(user));
        ReturnViewFactory returnViewFactory = new ReturnViewFactory();
        IReturnView returnView = returnViewFactory.returnView(role.getName());
        return returnView.returnView();
    }
}
