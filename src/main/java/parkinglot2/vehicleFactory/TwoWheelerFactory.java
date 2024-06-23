package parkinglot2.vehicleFactory;

import parkinglot2.vehicle.TwoWheeler;
import parkinglot2.vehicle.Vehicle;

public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String licenseNumber, String color) {
        return new TwoWheeler(licenseNumber,color);
    }
}
