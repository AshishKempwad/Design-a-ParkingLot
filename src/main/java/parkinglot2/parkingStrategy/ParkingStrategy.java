package parkinglot2.parkingStrategy;

import parkinglot2.ParkingFloor;
import parkinglot2.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot findSpot(List<ParkingSpot> parkingFloorList);

}
