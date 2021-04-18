package common.users;

import common.roles.Admin;
import common.users.Person;

public class Administrator extends Person {
    public Administrator(String firstName, String lastName, Admin role) {
        super(firstName, lastName, role);
    }
}
