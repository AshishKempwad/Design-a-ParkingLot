package parkinglot2.parkingStrategy;

import parkinglot2.ParkingFloor;
import parkinglot2.ParkingSpot;

import java.util.List;

public class FurthestParkingSpot implements ParkingStrategy{
    @Override
    public ParkingSpot findSpot(List<ParkingSpot> spots) {
        for(int i = spots.size()-1; i >= 0; i--){
            ParkingSpot spot = spots.get(i);

            if(!spot.isOccupied() ){
                return spot;
            }
        }

        return null;
    }
}
