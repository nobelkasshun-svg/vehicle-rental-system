package rental;

/**
 * V3.0 - Inheritance: Motorcycle "is-a" Vehicle
 * V4.0 - Method Overriding (runtime polymorphism)
 */
public class Motorcycle extends Vehicle {

    private boolean hasSidecar;

    public Motorcycle(String vehicleId, String brand,
                      double dailyRate, boolean hasSidecar) {
        super(vehicleId, brand, dailyRate);
        this.hasSidecar = hasSidecar;
    }

    public boolean hasSidecar() {
        return hasSidecar;
    }

    @Override
    public String getVehicleType() {
        return "Motorcycle";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("   Sidecar: " + hasSidecar);
    }
}