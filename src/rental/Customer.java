package rental;

/**
 * V1.0 - Class with attributes and methods
 * V2.0 - Encapsulation with private fields
 */
public class Customer {

    private String customerId;
    private String name;
    private String phoneNumber;

    public Customer(String customerId,
                    String name, String phoneNumber) {
        this.customerId  = customerId;
        this.name        = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getCustomerId()  { return customerId; }
    public String getName()        { return name; }
    public String getPhoneNumber() { return phoneNumber; }

    // Setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void displayInfo() {
        System.out.println(
            "Customer [" + customerId + "]: "
            + name + " | Phone: " + phoneNumber
        );
    }
}
