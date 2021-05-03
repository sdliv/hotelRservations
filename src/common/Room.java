package common;

import java.io.Serializable;

public class Room implements Serializable {

    private int qualityLevel;
    private int beds;
    private int roomNumber;
    private boolean smokingStatus;
    private boolean availability;
    private double price;
    private String description;

    public Room(int qualityLevel, int beds, boolean smokingStatus, boolean availability, String description, int roomNumber, double price) {
        this.qualityLevel = qualityLevel;
        this.beds = beds;
        this.smokingStatus = smokingStatus;
        this.availability = availability;
        this.description = description;

        this.roomNumber = roomNumber;
        this.price = price;
    }

    public int getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(int qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isSmokingStatus() {
        return smokingStatus;
    }

    public void setSmokingStatus(boolean smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String printRoomInformation() {

        return "Room Number: " + this.roomNumber + "\n" +
                "Quality Level: " + this.qualityLevel + "\n" +
                "Beds: " + this.beds + "\n" +
                "Smoking status: " + this.smokingStatus + "\n" +
                "Availability: " + this.availability + "\n" +
                "Description: " + this.description + "\n" +
                "Price: " + this.price;
    }
}
