package rental;

public class Main {
    public static void main(String[] args) {

        RentalManager manager = new RentalManager();

        // V1.0: Create objects
        Car car1 = new Car("V001", "Toyota Camry", 50.0, 5);
        Car car2 = new Car("V002", "Honda Civic",  40.0, 4);
        Motorcycle moto1 = new Motorcycle(
            "V003", "Yamaha MT-07", 25.0, false
        );

        // Add vehicles
        manager.addVehicle(car1);
        manager.addVehicle(car2);
        manager.addVehicle(moto1);

        // Add customers
        Customer c1 = new Customer(
            "C001", "Abebe Girma", "0911000001"
        );
        Customer c2 = new Customer(
            "C002", "Sara Tadesse", "0922000002"
        );
        manager.addCustomer(c1);
        manager.addCustomer(c2);

        // Show available vehicles
        manager.listAvailableVehicles();

        // Rent a vehicle
        manager.rentVehicle("V001", "C001", 3);

        // Show updated list
        manager.listAvailableVehicles();

        // Return vehicle
        manager.returnVehicle("V001");

        // V4.0: Overloading demo
        System.out.println(
            "\nCost with 10% discount: $" +
            car2.calculateRentalCost(5, 10)
        );

        // V4.0: Superclass reference demo
        Vehicle v = new Motorcycle(
            "V004", "Suzuki GSX", 30.0, true
        );
        System.out.println(
            "\nVehicle Type: " + v.getVehicleType()
        );
        v.displayInfo();
    }
}
