package com.java.demo.intro;
/*
 *  We declare a class named Animal.
 *  Inside the Animal class, we define a method named makeSound(). This method has no arguments (i.e., it takes no parameters) and does not return any value (i.e., it has a void return type).
 *   Within the makeSound() method, we print the message "Animal makes a sound" to the console using System.out.println().
 *   This line closes the makeSound() method.
 *   This line closes the Animal class definition.
 *   We declare a subclass named Cat that extends the Animal class. This means that Cat inherits the makeSound() method from the Animal class.
 *   We use the @Override annotation to indicate that we are overriding the makeSound() method inherited from the parent class (Animal). This annotation helps catch errors if the method signature doesn't match the parent class.
 *   Inside the Cat class, we provide our own implementation of the makeSound() method. This implementation prints "Cat meows" to the console.
 *   This line closes the makeSound() method in the Cat class.
 *   This line closes the Cat class definition.
 *    We declare a public class named Main.
 *    Inside the Main class, we define the main method, which is the entry point of the program. It takes an array of strings (String[] args) as its parameter.
 *    We create an instance of the Animal class and assign it to a variable named animal.
 *    create an instance of the Cat class and assign it to a variable named cat.
 *     We call the makeSound() method on the animal object. This calls the makeSound() method from the Animal class, so it prints "Animal makes a sound" to the console.
 *     We call the makeSound() method on the cat object. This calls the overridden makeSound() method from the Cat class, so it prints "Cat meows" to the console.
 *     This line closes the main method.
 *     This line closes the Main class definition.*/

	class Animal {
	    void makeSound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Cat extends Animal {
	    @Override
	    void makeSound() {
	        System.out.println("Cat meows");
	    }
	}

	public class MainClass {
		public static void main(String[] args) {
	        Animal animal = new Animal();
	        Cat cat = new Cat();

	        animal.makeSound(); 
	        cat.makeSound();    
	    }
	}

