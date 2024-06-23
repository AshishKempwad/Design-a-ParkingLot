package parkinglot2.parkingService;

import parkinglot2.vehicle.Vehicle;

public class ParkingDecoratorService implements ParkingService{

    protected Vehicle vehicle;

    public ParkingDecoratorService(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void provideService() {
          //Default Service
    }
}
