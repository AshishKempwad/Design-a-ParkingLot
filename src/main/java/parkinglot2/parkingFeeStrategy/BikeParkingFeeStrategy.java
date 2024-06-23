package parkinglot2.parkingFeeStrategy;

public class BikeParkingFeeStrategy implements ParkingFeeStrategy{
    @Override
    public double calculateFee(int hours) {
        return hours * 10;
    }
}
