package rental;

import java.util.ArrayList;

/**
 * V4.0 - Superclass references to manipulate subclass objects
 */
public class RentalManager {

    // V4.0: Superclass reference holds subclass objects
    private ArrayList<Vehicle> vehicles   = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    // Add vehicle and customer
    public void addVehicle(Vehicle v)   { vehicles.add(v); }
    public void addCustomer(Customer c) { customers.add(c); }

    // Show all available vehicles
    public void listAvailableVehicles() {
        System.out.println("\n--- Available Vehicles ---");
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) v.displayInfo();
        }
    }

    // Rent a vehicle
    public boolean rentVehicle(String vehicleId,
                               String customerId, int days) {
        Vehicle target   = findVehicle(vehicleId);
        Customer renter  = findCustomer(customerId);

        if (target == null) {
            System.out.println("Vehicle not found.");
            return false;
        }
        if (renter == null) {
            System.out.println("Customer not found.");
            return false;
        }
        if (!target.isAvailable()) {
            System.out.println("Vehicle not available.");
            return false;
        }

        target.setAvailable(false);
        double cost = target.calculateRentalCost(days);
        System.out.println("\nRental confirmed!");
        System.out.println(
            renter.getName() + " rented " +
            target.getBrand() +
            " for " + days + " days." +
            " Total: $" + cost
        );
        return true;
    }

    // Return a vehicle
    public void returnVehicle(String vehicleId) {
        Vehicle v = findVehicle(vehicleId);
        if (v != null) {
            v.setAvailable(true);
            System.out.println(
                v.getBrand() + " returned successfully."
            );
        }
    }

    // Helper methods
    private Vehicle findVehicle(String id) {
        for (Vehicle v : vehicles)
            if (v.getVehicleId().equals(id)) return v;
        return null;
    }

    private Customer findCustomer(String id) {
        for (Customer c : customers)
            if (c.getCustomerId().equals(id)) return c;
        return null;
    }
}
