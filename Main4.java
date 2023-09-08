package com.demo;

/*We define a base class named Vehicle with four private instance variables (make, model, year, and fuelType) to represent properties of a vehicle
 * The constructor Vehicle() is used to initialize these properties when an object of the Vehicle class is created.
 * Getter methods are provided to access the private instance variables from outside the class.
 * Placeholder methods for calculateFuelEfficiency(), calculateDistanceTraveled(), and calculateMaxSpeed() are included but return default values (0.0 or 0). These methods are meant to be overridden in subclasses with specific implementations.
 * We define a subclass Truck that extends the Vehicle class. It introduces an additional private instance variable, cargoCapacity, specific to trucks.
 * The constructor Truck() takes extra arguments for cargoCapacity, and it calls the superclass constructor (super(...)) to initialize the common properties inherited from Vehicle.
 * A getter method, getCargoCapacity(), is provided to retrieve the cargo capacity of the truck.
 * Placeholder methods for fuel efficiency, distance traveled, and max speed are overridden in the Truck class. However, these methods currently return default values (0.0 or 0) and need to be implemented with actual calculations for a truck.
 * We define another subclass, Car, that extends the Vehicle class. It introduces an additional private instance variable, seatingCapacity, specific to cars.
 * The constructor Car() takes extra arguments for seatingCapacity, and it calls the superclass constructor (super(...)) to initialize the common properties inherited from Vehicle.
 * A getter method, getSeatingCapacity(), is provided to retrieve the seating capacity of the car.
 * Placeholder methods for fuel efficiency, distance traveled, and max speed are overridden in the Car class. Similar to the Truck class, these methods currently return default values and should be implemented with actual calculations for a car.
 * We define the third subclass, Motorcycle, that also extends the Vehicle class. It introduces an additional private instance variable, hasHelmetCompartment, which represents whether the motorcycle has a helmet compartment
 * The constructor Motorcycle() takes extra arguments for hasHelmetCompartment, and it calls the superclass constructor (super(...)) to initialize the common properties inherited from Vehicle
 * A getter method, hasHelmetCompartment(), is provided to check if the motorcycle has a helmet compartment.
 * Placeholder methods for fuel efficiency, distance traveled, and max speed are overridden in the Motorcycle class, similar to the other subclasses. These methods currently return default values and should be implemented with actual calculations for a motorcycle.
 * Finally, we have a Main4 class with the main() method. However, this main() method is empty and doesn't contain any code. Typically, you would use this main() method to create instances of Truck, Car, and Motorcycle and use their methods to perform vehicle-related calculations.*/

class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double calculateFuelEfficiency() {
        return 0.0;
    }

    public double calculateDistanceTraveled(double fuelConsumed) {
        return 0.0;
    }

    public int calculateMaxSpeed() {
        return 0;
    }
}

class Truck extends Vehicle {
    private double cargoCapacity;

    public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
        super(make, model, year, fuelType);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0.0;
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        return 0.0;
    }

    @Override
    public int calculateMaxSpeed() {
        return 0;
    }
}

class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String make, String model, int year, String fuelType, int seatingCapacity) {
        super(make, model, year, fuelType);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0.0;
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        return 0.0;
    }

    @Override
    public int calculateMaxSpeed() {
        return 0;
    }
}

class Motorcycle extends Vehicle {
    private boolean hasHelmetCompartment;

    public Motorcycle(String make, String model, int year, String fuelType, boolean hasHelmetCompartment) {
        super(make, model, year, fuelType);
        this.hasHelmetCompartment = hasHelmetCompartment;
    }

    public boolean hasHelmetCompartment() {
        return hasHelmetCompartment;
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0.0;
    }

    @Override
    public double calculateDistanceTraveled(double fuelConsumed) {
        return 0.0;
    }

    @Override
    public int calculateMaxSpeed() {
        return 0;
    }
}

public class Main4 {
    public static void main(String[] args) {
    }
}

