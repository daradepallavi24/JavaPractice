package com.thread.demo;

/*PrimeSumCalculator is the main class containing the main method, where the program starts.
 * It initializes the limit and numThreads variables to control the range of numbers and the number of threads used for parallel processing.
 * An AtomicLong variable named primeSum is used to accumulate the sum of prime numbers. 
 * Atomic Long is used to ensure that concurrent access to the sum is thread-safe.
 * An array of Thread objects (threads) and an array of PrimeFinder objects (primeFinders) are created to manage the threads and their associated tasks.
 * The segmentSize is calculated, which represents the portion of the number range each thread is responsible for.
 * A loop creates and starts the threads. Each thread is responsible for finding prime numbers within its assigned segment.
 * The PrimeFinder class is a nested class that implements the Runnable interface. 
 * It represents the task of finding prime numbers within a specific segment of the number range.
 * The isPrime method within the PrimeFinder class checks whether a given number is prime. 
 * It uses a basic primality test to do so.
 * In the run method of the PrimeFinder class, each thread calculates the sum of prime numbers within its assigned segment and updates the localSum variable.
 * The localSum calculated by each thread is added to the shared primeSum variable using the primeSum.addAndGet(localSum) method.
 * After all threads have completed their work, the main thread waits for them to finish using the thread.join() method for each thread.
 * Finally, the program prints the total sum of prime numbers found up to the specified limit by accessing the primeSum variable using primeSum.get().
*/
import java.util.concurrent.atomic.AtomicLong;

public class PrimeSumCalculator {
    public static void main(String[] args) {
        int limit = 1000; // Change this to the desired limit
        int numThreads = 4; // Change this to the desired number of threads

        AtomicLong primeSum = new AtomicLong(0);

        Thread[] threads = new Thread[numThreads];
        PrimeFinder[] primeFinders = new PrimeFinder[numThreads];

        int segmentSize = limit / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * segmentSize + 1;
            int end = (i == numThreads - 1) ? limit : (i + 1) * segmentSize;
            primeFinders[i] = new PrimeFinder(start, end, primeSum);
            threads[i] = new Thread(primeFinders[i]);
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of prime numbers up to " + limit + " is: " + primeSum.get());
    }

    static class PrimeFinder implements Runnable {
        private int start;
        private int end;
        private AtomicLong primeSum;

        public PrimeFinder(int start, int end, AtomicLong primeSum) {
            this.start = start;
            this.end = end;
            this.primeSum = primeSum;
        }

        @Override
        public void run() {
            long localSum = 0;
            for (int num = start; num <= end; num++) {
                if (isPrime(num)) {
                    localSum += num;
                }
            }
            primeSum.addAndGet(localSum);
        }

        private boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            }
            if (n <= 3) {
                return true;
            }
            if (n % 2 == 0 || n % 3 == 0) {
                return false;
            }
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
