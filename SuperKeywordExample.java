package com.Interface.demo;

/*We have a parent class called Animal with an instance variable species, a constructor that initializes species, and a makeSound method.
 * We create a subclass called Dog that extends Animal. 
 * The Dog class has an additional instance variable name, and it has its constructor that calls the constructor of the superclass (Animal) using super(species).
 * In the Dog class, we override the makeSound method to provide a specialized implementation for dogs.
 * We also create a method displayInfo in the Dog class that uses super.species to access the species field from the superclass.
 * In the main method, we create a Dog object and demonstrate the use of the super keyword to call the superclass constructor and access the superclass field. 
 * We also call the overridden makeSound method to show polymorphism in action.
 * */

//Parent class (superclass)
class Animal {
 String species;

 // Constructor
 Animal(String species) {
     this.species = species;
 }

 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass
class Dog extends Animal {
 String name;

 // Constructor
 Dog(String species, String name) {
     // Call the constructor of the superclass using "super"
     super(species);
     this.name = name;
 }

 // Override the makeSound method of the superclass
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }

 void displayInfo() {
     // Access the "species" field of the superclass using "super"
     System.out.println("Species: " + super.species);
     System.out.println("Name: " + this.name);
 }
}

public class SuperKeywordExample {
 public static void main(String[] args) {
     // Create a Dog object
     Dog dog = new Dog("Canine", "Buddy");

     // Call the overridden method in the subclass
     dog.makeSound();

     // Call the method in the subclass that uses "super" to access the superclass field
     dog.displayInfo();
 }
}
