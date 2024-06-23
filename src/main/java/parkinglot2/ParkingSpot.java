package parkinglot2;

import parkinglot2.observer.Observer;
import parkinglot2.vehicle.Vehicle;
import parkinglot2.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpot {
    private int id;
    private boolean isOccupied;
    private Vehicle vehicle;
    VehicleType vehicleType;


    public ParkingSpot(int id, VehicleType vehicleType) {
        this.id = id;
        this.isOccupied = false;
        this.vehicleType=vehicleType;

    }

    public int getId() {
        return id;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void acquireSpot(Vehicle vehicle){
        if(vehicle.getVehicleType() != this.vehicleType){
            throw new IllegalArgumentException("Vehicle Type Mismatch");
        }
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacateSpot(){
        this.vehicle = null;
        this.isOccupied = false;
    }



}
