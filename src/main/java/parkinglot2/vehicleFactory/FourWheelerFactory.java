package parkinglot2.vehicleFactory;

import parkinglot2.vehicle.FourWheeler;
import parkinglot2.vehicle.Vehicle;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle(String licenseNumber, String color) {
        return new FourWheeler(licenseNumber,color);
    }
}
