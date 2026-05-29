package rental;

/**
 * DAY 1 COMMIT
 * V1.0 - Class with attributes and methods
 * V2.0 - Encapsulation with private fields
 */
public abstract class Vehicle {

    // V2.0: private fields - encapsulation
    private String vehicleId;
    private String brand;
    private double dailyRate;
    private boolean isAvailable;

    // V1.0: Constructor
    public Vehicle(String vehicleId, String brand, double dailyRate) {
        this.vehicleId   = vehicleId;
        this.brand       = brand;
        this.dailyRate   = dailyRate;
        this.isAvailable = true;
    }

    // V2.0: Getters
    public String getVehicleId() { return vehicleId; }
    public String getBrand()     { return brand; }
    public double getDailyRate() { return dailyRate; }
    public boolean isAvailable() { return isAvailable; }

    // V2.0: Setters
    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public void setDailyRate(double rate) {
        if (rate > 0) this.dailyRate = rate;
    }

    // V4.0: Abstract method
    public abstract String getVehicleType();

    // V4.0: Method OVERLOADING
    public double calculateRentalCost(int days) {
        return dailyRate * days;
    }

    public double calculateRentalCost(int days, double discountPercent) {
        double total = dailyRate * days;
        return total - (total * discountPercent / 100);
    }

    // V1.0: Display method
    public void displayInfo() {
        System.out.println(
            "[" + vehicleId + "] " + getVehicleType() +
            " - " + brand +
            " | $" + dailyRate + "/day" +
            " | Available: " + isAvailable
        );
    }
}