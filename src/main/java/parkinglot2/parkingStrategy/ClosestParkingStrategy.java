package parkinglot2.parkingStrategy;

import parkinglot2.ParkingFloor;
import parkinglot2.ParkingLot;
import parkinglot2.ParkingSpot;

import java.util.List;

public class ClosestParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots) {
        for(int i=0;i<spots.size();i++){
            ParkingSpot spot = spots.get(i);
            if(!spot.isOccupied() ){
                return spot;
            }
        }
        return null;
    }
}
