package parkinglot2.vehicleFactory;

import parkinglot2.vehicle.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String licenseNumber, String color);
}
