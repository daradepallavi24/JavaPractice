package com.thread.demo;

/*The BankAccount class has a private balance field, and methods for depositing (deposit), withdrawing (withdraw), and getting the balance (getBalance). 
 * The deposit and withdraw methods are synchronized, meaning that only one thread can execute them at a time to prevent race conditions.
 * In the main method, a BankAccount object named account is created with an initial balance of 1000.0.
 * Two threads, depositThread and withdrawThread, are created using lambda expressions. 
 * Each thread performs its respective operation in a loop for 5 iterations. 
 * The deposit thread deposits 100.0 each time, and the withdraw thread attempts to withdraw 200.0 each time.
 * Both threads start running concurrently using the start method.
 * The join method is used to ensure that the main method waits for both threads to finish before printing the final balance. 
 * This is important to see the effect of concurrent operations on the account balance.
 * The program prints the final balance after both threads have completed their operations.*/

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public synchronized void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        Thread depositThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.deposit(100.0);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread withdrawThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                account.withdraw(200.0);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        depositThread.start();
        withdrawThread.start();

        try {
            depositThread.join();
            withdrawThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
