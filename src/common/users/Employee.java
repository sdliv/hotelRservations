package common.users;

import common.roles.PowerUser;

public class Employee extends Person {
    public Employee(String firstName, String lastName, PowerUser role) {
        super(firstName, lastName, role);
    }
}
