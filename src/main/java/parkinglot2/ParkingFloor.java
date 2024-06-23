package parkinglot2;

import parkinglot2.parkingFeeStrategy.ParkingFeeStrategy;
import parkinglot2.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    private int floorNumber;
    private List<ParkingSpot> parkingSpotList;
    private VehicleType vehicleType;
    private ParkingFeeStrategy parkingFeeStrategy;

    public ParkingFloor(int floorNumber, int capacity, VehicleType vehicleType){
        this.floorNumber = floorNumber;
        this.vehicleType = vehicleType;
        parkingSpotList = new ArrayList<>();

        for(int i=0;i<capacity;i++){
            parkingSpotList.add(new ParkingSpot(i+1, vehicleType));
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingFeeStrategy(ParkingFeeStrategy parkingFeeStrategy) {
        this.parkingFeeStrategy = parkingFeeStrategy;
    }

    public ParkingFeeStrategy getParkingFeeStrategy() {
        return parkingFeeStrategy;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }


}
