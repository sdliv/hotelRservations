package common.users;

import common.roles.Role;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;

    private Role role;

    public Person(String firstName, String lastName, Role role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
