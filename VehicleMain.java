package com.Interface.demo;

/*We have an abstract class Vehicle with two abstract methods, startEngine() and stopEngine(). This class serves as a blueprint for all types of vehicles.
 * We have two concrete subclasses, Car and Motorcycle, which extend the Vehicle class and provide implementations for the abstract methods.
 * In the Car class, the startEngine() method prints "Car engine started," and the stopEngine() method prints "Car engine stopped."
 * In the Motorcycle class, the startEngine() method prints "Motorcycle engine started," and the stopEngine() method prints "Motorcycle engine stopped."
 * In the VehicleMain class (the main entry point of the program), we create instances of both Car and Motorcycle.
 * We create a car object and assign it to the Vehicle reference car. This is possible because Car is a subclass of Vehicle. 
 * We then call startEngine() on the car object, which invokes the startEngine() method of the Car class, printing "Car engine started.
 * " Next, we call stopEngine(), which invokes the stopEngine() method of the Car class, printing "Car engine stopped."
 * Similarly, we create a motorcycle object and assign it to the Vehicle reference motorcycle.
 *  We call startEngine() on the motorcycle object, which invokes the startEngine() method of the Motorcycle class, printing "Motorcycle engine started.
 *  " Finally, we call stopEngine(), which invokes the stopEngine() method of the Motorcycle class, printing "Motorcycle engine stopped."
 *  */

//Abstract Vehicle class
abstract class Vehicle {
 public abstract void startEngine();

 public abstract void stopEngine();
}

//Car subclass
class Car extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Car engine started.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Car engine stopped.");
 }
}

//Motorcycle subclass
class Motorcycle extends Vehicle {
 @Override
 public void startEngine() {
     System.out.println("Motorcycle engine started.");
 }

 @Override
 public void stopEngine() {
     System.out.println("Motorcycle engine stopped.");
 }
}

public class VehicleMain {
 public static void main(String[] args) {
     // Create a Car and start/stop its engine
     Vehicle car = new Car();
     car.startEngine();
     car.stopEngine();

     // Create a Motorcycle and start/stop its engine
     Vehicle motorcycle = new Motorcycle();
     motorcycle.startEngine();
     motorcycle.stopEngine();
 }
}

