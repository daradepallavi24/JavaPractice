package com.Interface.demo;

/*We have three classes: Person, Athlete, and LazyPerson.
 * Person is an abstract class with two abstract methods: eat() and exercise(). Abstract methods in Java are meant to be implemented by subclasses.
 * Athlete is a subclass of Person and overrides the eat() and exercise() methods with specific implementations for athletes.
 * LazyPerson is another subclass of Person and also overrides the eat() and exercise() methods with specific implementations for lazy individuals.
 * In the Main class, we have the main method where we create instances of Athlete and LazyPerson.
 * We create an instance of Athlete called athlete and an instance of LazyPerson called lazyPerson.
 * We then print out information about each person's habits using the eat() and exercise() methods.
 * */

//Abstract Person class
abstract class Person {
 // Abstract eat method
 public abstract void eat();
 
 // Abstract exercise method
 public abstract void exercise();
}

//Subclass Athlete
class Athlete extends Person {
 @Override
 public void eat() {
     System.out.println("An athlete eats a balanced diet to stay healthy and fit.");
 }

 @Override
 public void exercise() {
     System.out.println("An athlete exercises regularly to maintain peak performance.");
 }
}

//Subclass LazyPerson
class LazyPerson extends Person {
 @Override
 public void eat() {
     System.out.println("A lazy person might eat fast food and unhealthy snacks.");
 }

 @Override
 public void exercise() {
     System.out.println("A lazy person rarely exercises and leads a sedentary lifestyle.");
 }
}

public class PersonMain {
 public static void main(String[] args) {
     // Create an Athlete and a LazyPerson
     Athlete athlete = new Athlete();
     LazyPerson lazyPerson = new LazyPerson();

     // Describe how each person eats and exercises
     System.out.println("Athlete's habits:");
     athlete.eat();
     athlete.exercise();

     System.out.println("\nLazy Person's habits:");
     lazyPerson.eat();
     lazyPerson.exercise();
 }
}

