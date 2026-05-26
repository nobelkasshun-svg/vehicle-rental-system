 # Vehicle Rental System

A console-based Vehicle Rental System built with Java,
demonstrating core Object-Oriented Programming (OOP) concepts.

---

## How to Compile and Run

Step 1: Go to src folder
cd src

Step 2: Compile all files
javac rental/*.java

Step 3: Run the program
java rental.Main

---

## Project Structure

src/
└── rental/
    ├── Vehicle.java
    ├── Car.java
    ├── Motorcycle.java
    ├── Customer.java
    ├── RentalManager.java
    └── Main.java

---

## OOP Concepts Demonstrated

### V1.0 - Classes and Objects
- File: Vehicle.java - Line 8
- File: Main.java - Line 6
- Created real world objects like Car, Motorcycle and Customer

### V2.0 - Encapsulation
- File: Vehicle.java - Lines 11 to 14
- File: Customer.java - Lines 6 to 8
- All fields are private with getters and setters

### V3.0 - Inheritance
- File: Car.java - Line 8
- File: Motorcycle.java - Line 8
- Car and Motorcycle both extend Vehicle using is-a relationship

### V4.0 - Polymorphism
- Method Overriding: Car.java Line 22, Motorcycle.java Line 20
- Method Overloading: Vehicle.java Lines 43 to 51
- Superclass Reference: RentalManager.java Line 10

---

## Sample Output

--- Available Vehicles ---
[V001] Car - Toyota Camry | $50.0/day | Available: true
   Seats: 5
[V002] Car - Honda Civic | $40.0/day | Available: true
   Seats: 4
[V003] Motorcycle - Yamaha MT-07 | $25.0/day | Available: true
   Sidecar: false

Rental confirmed!
Abebe Girma rented Toyota Camry for 3 days. Total: $150.0

Toyota Camry returned successfully.

Cost with 10% discount: $180.0

---

## Author
- GitHub: nobelkasshun-svg
