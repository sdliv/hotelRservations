package common;

import jdk.dynalink.beans.StaticClass;

import java.util.ArrayList;

public class Hotel {
    private static ArrayList<Room> availableRooms = new ArrayList<>();
    private static ArrayList<Room> reservedRooms = new ArrayList<>();

    public static String addRoom(Room room) {
        availableRooms.add(room);
        return "Room Added";
    }

    public static String reserveRoom(Room room) {
        reservedRooms.add(room);
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
