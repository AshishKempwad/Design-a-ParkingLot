package parkinglot2.parkingFeeStrategy;

public class CarparkingFeeStrategy implements ParkingFeeStrategy{
    @Override
    public double calculateFee(int hours) {
        return 20*hours;
    }
}
