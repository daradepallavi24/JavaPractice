package com.thread.demo;

/*Two Runnable objects, evenPrinter and oddPrinter, are created using lambda expressions. 
 * These Runnables contain the code for printing even and odd numbers, respectively.
 * The evenPrinter Runnable prints even numbers from 2 to 20, incrementing by 2 in each iteration.
 * The oddPrinter Runnable prints odd numbers from 1 to 19, incrementing by 2 in each iteration.
 * Two Thread objects, evenThread and oddThread, are created, and each is initialized with one of the Runnables. 
 * This means the evenThread will execute the evenPrinter Runnable, and the oddThread will execute the oddPrinter Runnable.
 * Both threads are started using the start method, which will execute their respective Runnables concurrently.
 * After starting the threads, the main thread calls evenThread.join() and oddThread.join() to wait for both threads to finish execution before the main thread proceeds. 
 * This ensures that the even and odd numbers are printed in an orderly manner.*/

public class EvenOddPrinter {
    public static void main(String[] args) {
        // Create two Runnable objects for even and odd number printing
        Runnable evenPrinter = () -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.println("Even: " + i);
            }
        };

        Runnable oddPrinter = () -> {
            for (int i = 1; i <= 19; i += 2) {
                System.out.println("Odd: " + i);
            }
        };

        // Create two threads for even and odd number printing
        Thread evenThread = new Thread(evenPrinter);
        Thread oddThread = new Thread(oddPrinter);

        // Start both threads
        evenThread.start();
        oddThread.start();

        try {
            // Wait for both threads to finish before exiting
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
