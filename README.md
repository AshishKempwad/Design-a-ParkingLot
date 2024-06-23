Explanation:

ParkingLot:
Singleton instance
Manages multiple ParkingFloors
Has a parking strategy and a map of floor numbers to parking fee strategies
Manages observers (for the observer pattern)

ParkingFloor:
Represents a floor in the parking lot
Contains multiple ParkingSpots
Holds the vehicle type it accommodates

ParkingSpot:
Represents an individual parking spot
Can park and leave a vehicle

Vehicle (Abstract):
Base class for all vehicle types
Includes attributes like license plate and color

Car & Bike (Concrete Vehicles):
Extend the Vehicle class
Represent specific types of vehicles

Ticket:
Represents a parking ticket issued when a vehicle parks
Contains details like vehicle license plate, parking spot, and floor number

ParkingFeeStrategy (Interface):
Interface for different parking fee calculation strategies
Includes concrete strategies like CarParkingFeeStrategy and BikeParkingFeeStrategy

ParkingStrategy (Interface):
Interface for parking strategies
Includes a concrete strategy like FurthestParkingStrategy

ParkingObserver (Interface):
Interface for observers that respond to parking events
Includes concrete observers like LoggingObserver and NotificationObserver


+---------------------------------------------------+
|                   ParkingLot                      |
| +---------------------------------------------+   |
| |               ParkingFloor[]                |   |
| | +---------------+  +---------------+        |   |
| | | ParkingFloor  |  | ParkingFloor  | ...    |   |
| | |  (Floor 1)    |  |  (Floor 2)    |        |   |
| | +---------------+  +---------------+        |   |
| +---------------------------------------------+   |
|                   ^    ^    ^                    |
|                   |    |    |                    |
|      +------------+    |    +------------+       |
|      |                 |                 |       |
| +----+----+       +----+----+       +----+----+  |
| |  Observer|       |  Strategy |     |  FeeMap  | |
| +---------+       +---------+       +---------+  |
+---------------------------------------------------+
         ^                ^
         |                |
+--------+----------------+-------+
|                                 |
| +---------------------------+   |
| |          Ticket           |   |
| +---------------------------+   |
| +---------------------------+   |
| |         Vehicle           |   |
| +---------------------------+   |
|     ^          ^          ^     |
|     |          |          |     |
| +---+---+  +---+---+  +---+---+ |
| |  Car  |  |  Bike |  |  ...  | |
| +-------+  +-------+  +-------+ |
+---------------------------------+


Explanation:

ParkingLot:
Central component managing the entire parking lot, including floors, fee strategies, and observers.

ParkingFloor:![ParkingLotLLD](https://github.com/AshishKempwad/Design-a-ParkingLot/assets/54923496/00359e60-ec6f-4963-858b-297c90cf078c)

Sub-component under ParkingLot representing each floor, containing parking spots.

ParkingSpot:
Represents individual parking spots managed by ParkingFloor.
Vehicle and its Subtypes (Car, Bike, etc.):
Represent the different vehicles that can park in the lot.

Ticket:
Issued when a vehicle parks, linked to a specific parking spot and floor.

ParkingStrategy and ParkingFeeStrategy:
Strategy patterns for parking and fee calculation, allowing flexible strategy changes.

Observer:
Implements the observer pattern for event notifications within the parking lot.

FeeMap:
A map linking each floor to its respective parking fee strategy for flexible fee management.
