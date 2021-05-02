package common.operations;

import common.roles.Role;
import common.users.Person;
import common.views.UserView;

public class LoginOperation implements HotelOperation {

    private Person user;

    public LoginOperation(Person user) {
        this.user = user;
    }
    @Override
    public Role execute() {
        return user.getRole();
    }
}
