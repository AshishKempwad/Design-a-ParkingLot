package parkinglot2.observer;

public class ParkingObserver implements Observer{
    @Override
    public void update(String message) {
        System.out.println("Notification : " + message );
    }
}
