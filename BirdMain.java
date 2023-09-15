package com.Interface.demo;

/*We have a package named com.Interface.demo containing some Java classes: Bird, Eagle, Hawk, and BirdMain.
 * The Bird class is like a blueprint for birds. It says that all birds should have two behaviors: fly() and makeSound(). 
 * However, it doesn't tell us how each bird performs these behaviors; it's like a plan or a template.
 * The Eagle class is a specific kind of bird, in this case, an eagle.
 * It takes the Bird blueprint and provides specific instructions for how an eagle should fly() and makeSound(). 
 * So, it says eagles soar high and screech loudly.
 * The Hawk class is another specific bird class, this time representing a hawk. 
 * Like the Eagle class, it also follows the Bird blueprint but provides its own instructions for fly() and makeSound().
 * Hawks glide gracefully and emit a piercing scream.
 * Now, we have a BirdMain class. This is the main part of our program where everything starts.
 * In the main method (the starting point of the program), we create two birds: an eagle and a hawk.
 * After creating these birds, we describe how each of them behaves:
 * We say, "Eagle's characteristics:"
 * Then, we ask the eagle to perform its fly() and makeSound() actions. It does so by soaring high and screeching loudly.
 * Next, we say, "Hawk's characteristics:"
 * We ask the hawk to perform its fly() and makeSound() actions. It does so by gliding gracefully and emitting a piercing scream.
 * The program prints out these descriptions and actions, so we can see what each bird does
 * */

//Abstract Bird class
abstract class Bird {
 // Abstract fly method
 public abstract void fly();

 // Abstract makeSound method
 public abstract void makeSound();
}

//Subclass Eagle
class Eagle extends Bird {
 @Override
 public void fly() {
     System.out.println("The eagle soars high in the sky.");
 }

 @Override
 public void makeSound() {
     System.out.println("The eagle screeches loudly.");
 }
}

//Subclass Hawk
class Hawk extends Bird {
 @Override
 public void fly() {
     System.out.println("The hawk glides gracefully through the air.");
 }

 @Override
 public void makeSound() {
     System.out.println("The hawk emits a piercing scream.");
 }
}

public class BirdMain {
 public static void main(String[] args) {
     // Create an Eagle and a Hawk
     Eagle eagle = new Eagle();
     Hawk hawk = new Hawk();

     // Describe how each bird flies and makes a sound
     System.out.println("Eagle's characteristics:");
     eagle.fly();
     eagle.makeSound();

     System.out.println("\nHawk's characteristics:");
     hawk.fly();
     hawk.makeSound();
 }
}

