package common.roles;

import java.io.Serializable;

// Parent class for Roles.

public class Role implements Serializable {

    private String name;

    public Role(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
