package common.operations;

import common.roles.Role;
import common.users.Person;

import java.util.ArrayList;

public class HotelOperationExecutor {

    private final ArrayList<HotelOperation> hotelOperations = new ArrayList<>();

    public Role executeOperation(HotelOperation hotelOperation) {
        hotelOperations.add(hotelOperation);
        return hotelOperation.execute();
    }
}
