package com.Interface.demo;

/*We have a Vehicle class with start and stop methods. We also have Car and Bicycle classes that extend Vehicle.
 * In the Car class, we override the start method and provide a specialized implementation, while we override the stop method to change its behavior.
 * In the Bicycle class, we have an additional method pedal specific to bicycles.
 * In the main method, we create instances of Vehicle, Car, and Bicycle classes and call their methods. 
 * This demonstrates method overriding because the actual method called depends on the runtime type of the object.
 * We also demonstrate method overloading with the accelerate methods. Depending on the argument passed, the appropriate overloaded method is called. 
 * This illustrates method overloading because methods with the same name but different parameter types are defined in the same class.
 * */

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car started");
    }

    @Override
    void stop() {
        System.out.println("Car stopped");
    }
}

class Bicycle extends Vehicle {
    void pedal() {
        System.out.println("Bicycle pedaling");
    }
}

public class MethodOverloadingandoverriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // Method Overriding
        vehicle.start(); // Calls the start method in the Vehicle class
        vehicle.stop();  // Calls the stop method in the Vehicle class

        car.start();     // Calls the overridden start method in the Car class
        car.stop();      // Calls the overridden stop method in the Car class

        bicycle.start(); // Calls the start method in the Vehicle class (inherited)
        bicycle.pedal(); // Calls the pedal method in the Bicycle class

        // Method Overloading
        accelerate(vehicle); // Calls the overloaded method with a Vehicle parameter
        accelerate(car);     // Calls the overloaded method with a Car parameter
        accelerate(bicycle); // Calls the overloaded method with a Bicycle parameter
    }

    // Method Overloading
    static void accelerate(Vehicle vehicle) {
        System.out.println("Accelerating a vehicle (method overloading)");
    }

    static void accelerate(Car car) {
        System.out.println("Accelerating a car (method overloading)");
    }

    static void accelerate(Bicycle bicycle) {
        System.out.println("Accelerating a bicycle (method overloading)");
    }
}

