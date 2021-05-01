package common;

public class Room {

    private int qualityLevel;
    private int beds;
    private int roomNumber;
    private boolean smokingStatus;
    private boolean availability;
    private double price;
    private String description;
    private int reservationNumber;

    public Room(int qualityLevel, int beds, int roomNumber, boolean smokingStatus, boolean availability, double price, String description, int reservationNumber) {
        this.qualityLevel = qualityLevel;
        this.beds = beds;
        this.smokingStatus = smokingStatus;
        this.availability = availability;
        this.description = description;
        this.reservationNumber = reservationNumber;
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

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }
}
