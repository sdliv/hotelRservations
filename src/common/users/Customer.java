package common.users;

import common.roles.CUser;
import common.views.CustomerView;

import java.io.Serializable;

public class Customer extends Person {

    private CustomerView view;

    public Customer(String firstName, String lastName, CUser role) {
        super(firstName, lastName, role);
    }

    public CustomerView getView() {
        return view;
    }

    public void setView(CustomerView view) {
        this.view = view;
    }
}
