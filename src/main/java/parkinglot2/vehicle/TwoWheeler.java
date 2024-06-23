package parkinglot2.vehicle;

public class TwoWheeler extends Vehicle{
    public TwoWheeler(String licenseNumber, String color) {
        super(licenseNumber, color);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.TWO_WHEELER;
    }
}
