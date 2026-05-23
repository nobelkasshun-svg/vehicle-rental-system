package rental;

/**
 * V3.0 - Inheritance: Car "is-a" Vehicle
 * V4.0 - Method Overriding (runtime polymorphism)
 */
public class Car extends Vehicle {

    // Car's own private field
    private int numberOfSeats;

    // V3.0: Constructor calls parent using super()
    public Car(String vehicleId, String brand,
               double dailyRate, int numberOfSeats) {
        super(vehicleId, brand, dailyRate);
        this.numberOfSeats = numberOfSeats;
    }

    // Getter for seats
    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    // V4.0: Overriding abstract method from Vehicle
    @Override
    public String getVehicleType() {
        return "Car";
    }

    // V4.0: Overriding displayInfo from Vehicle
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Seats: " + numberOfSeats);
    }
}
