package common;

import java.io.Serializable;

import java.util.ArrayList;

// Hotel Class: Responsible for setting number of Rooms in hotel.

public class Hotel implements Serializable {
    private static ArrayList<Room> availableRooms = new ArrayList<>();
    private static ArrayList<Room> reservedRooms = new ArrayList<>();
    private static final Hotel hotel = new Hotel();

    private Hotel() {
        Room roomOne = new Room(4, 2, false, true, "Nice and large room", 255, 150.00 );
        Room roomTwo = new Room(5, 1, false, true, "Single Luxurious Room", 124, 200.00 );
        Room roomThree = new Room(3, 2, false, true, "Cheaper Room, Less Space", 214, 100.00 );

        addRoom(roomOne);
        addRoom(roomTwo);
        addRoom(roomThree);
    }

    public static Hotel getInstance() {
        return hotel;
    }

    public static String addRoom(Room room) {
        availableRooms.add(room);
        return "Room Added";
    }

    public static String reserveRoom(Room room) {
        reservedRooms.add(room);
        availableRooms.remove(room);
        return "Room: " + room.getRoomNumber() + " reserved";
    }

    public static ArrayList<Room> getAvailableRooms() {
        return availableRooms;
    }

    public static void setAvailableRooms(ArrayList<Room> availableRooms) {
        Hotel.availableRooms = availableRooms;
    }

    public static ArrayList<Room> getReservedRooms() {
        return reservedRooms;
    }

    public static void setReservedRooms(ArrayList<Room> reservedRooms) {
        Hotel.reservedRooms = reservedRooms;
    }
}
