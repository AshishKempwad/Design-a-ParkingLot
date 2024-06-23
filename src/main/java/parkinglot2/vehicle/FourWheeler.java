package parkinglot2.vehicle;

public class FourWheeler extends Vehicle{
    public FourWheeler(String licenseNumber, String color) {
        super(licenseNumber, color);
    }

    @Override
    public VehicleType getVehicleType() {
        return VehicleType.FOUR_WHEELER;
    }
}
