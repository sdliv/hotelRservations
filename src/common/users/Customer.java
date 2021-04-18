package common.users;

import common.roles.CUser;

import java.io.Serializable;

public class Customer extends Person {


    public Customer(String firstName, String lastName, CUser role) {
        super(firstName, lastName, role);
    }
}
