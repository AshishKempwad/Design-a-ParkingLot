package parkinglot2;

import parkinglot2.observer.Observer;
import parkinglot2.observer.ParkingObserver;
import parkinglot2.parkingFeeStrategy.BikeParkingFeeStrategy;
import parkinglot2.parkingFeeStrategy.CarparkingFeeStrategy;
import parkinglot2.parkingStrategy.ClosestParkingStrategy;
import parkinglot2.parkingStrategy.FurthestParkingSpot;
import parkinglot2.vehicle.FourWheeler;
import parkinglot2.vehicle.TwoWheeler;
import parkinglot2.vehicle.Vehicle;
import parkinglot2.vehicle.VehicleType;
import parkinglot2.vehicleFactory.FourWheelerFactory;
import parkinglot2.vehicleFactory.TwoWheelerFactory;
import parkinglot2.vehicleFactory.VehicleFactory;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Create a Parking Lot with multiple floors and specify vehicle types for each floor
        List<VehicleType> vehicleTypeForEachFloor = Arrays.asList(VehicleType.TWO_WHEELER,VehicleType.TWO_WHEELER,VehicleType.FOUR_WHEELER,VehicleType.FOUR_WHEELER,VehicleType.FOUR_WHEELER);
        ParkingLot parkingLot = ParkingLot.getInstance(5,10,vehicleTypeForEachFloor);

        // Set parking strategy to Closest
        parkingLot.setParkingStrategy(new FurthestParkingSpot());

        // Set parking fee strategies for floors
        parkingLot.setFeeStrategyMap(1, new BikeParkingFeeStrategy());
        parkingLot.setFeeStrategyMap(2, new BikeParkingFeeStrategy());
        parkingLot.setFeeStrategyMap(3, new CarparkingFeeStrategy());
        parkingLot.setFeeStrategyMap(4, new CarparkingFeeStrategy());
        parkingLot.setFeeStrategyMap(5, new CarparkingFeeStrategy());

        // Add observers
        Observer parkingObserver = new ParkingObserver();
        parkingLot.addObserver(parkingObserver);

        // Create Vehicles using Factory Pattern
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Vehicle twoWheeler = new TwoWheeler("MH 10 DD 4110","Red");

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        Vehicle fourWheeler = new FourWheeler("KA 02 FG 8878", "Blue");

        // Park vehicles and simulate leaving
        Ticket fourWheelerTicket = parkingLot.parkVehicle(fourWheeler);
        Ticket twoWheelerTicket = parkingLot.parkVehicle(twoWheeler);

        if(fourWheelerTicket != null){
            parkingLot.leaveVehicle(fourWheelerTicket,4);
        }

        if(twoWheelerTicket != null){
            parkingLot.leaveVehicle(twoWheelerTicket,2);
        }

    }
}
