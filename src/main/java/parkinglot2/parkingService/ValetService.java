package parkinglot2.parkingService;

import parkinglot2.vehicle.Vehicle;

public class ValetService extends ParkingDecoratorService{
    public ValetService(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void provideService() {
        System.out.println("Providing valet service for vehicle : " + vehicle);
    }
}
