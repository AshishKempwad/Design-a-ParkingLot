package parkinglot2;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Ticket {
    private static int ticketCounter = 0;
    private int ticketId;
    private String licensePlate;
    private LocalDateTime entryTime;
    private ParkingSpot parkingSpot;
    private int floorNumber;

    public Ticket(String licensePlate, ParkingSpot parkingSpot, int floorNumber){
        this.ticketId = ++ticketCounter;
        this.licensePlate = licensePlate;
        this.parkingSpot = parkingSpot;
        this.entryTime = LocalDateTime.now();
        this.floorNumber=floorNumber;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
