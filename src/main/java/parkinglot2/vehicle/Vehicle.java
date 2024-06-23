package parkinglot2.vehicle;

public abstract class Vehicle {
    private String licenseNumber;
    private String color;

    public Vehicle(String licenseNumber, String color) {
        this.licenseNumber = licenseNumber;
        this.color = color;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getColor() {
        return color;
    }

    public abstract VehicleType getVehicleType();
}
