package common.operations;

import common.roles.Role;
import common.users.Person;

// Command Pattern Interface

public interface HotelOperation {
    Role execute();
}
