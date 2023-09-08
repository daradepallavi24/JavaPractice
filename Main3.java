package com.demo;

/*
 * We define the BankAccount class with a protected balance attribute to store the account balance.
 * Inside the BankAccount class, we have a constructor that initializes the balance with an initial balance provided as an argument.
 * The deposit(double amount) method allows you to deposit money into the account. It checks if the deposit amount is greater than zero and adds it to the balance.
 * The withdraw(double amount) method allows you to withdraw money from the account. It checks if the withdrawal amount is valid (greater than zero and not exceeding the balance) and deducts it from the balance.
 * The getBalance() method returns the current account balance.
 * We define a SavingsAccount subclass that extends BankAccount. This subclass inherits the attributes and methods of BankAccount.
 * In the SavingsAccount subclass, we override the withdraw(double amount) method to implement custom behavior. It checks if the withdrawal amount is valid, the balance is at least $100, and then allows the withdrawal.
 * The Main class contains the main method where we create instances of both BankAccount and SavingsAccount.
 * We create account1 as a BankAccount with an initial balance of $500, deposit $200, and withdraw $300 from it. The balance is printed.
 * We create account2 as a SavingsAccount with an initial balance of $300, deposit $50, and attempt to withdraw $75. An error message is printed because the balance falls below $100.
 * We then withdraw $50 from account2, and the balance is printed.
 * The program demonstrates the functionality of the BankAccount and SavingsAccount classes, including deposit, withdrawal, and the overridden withdraw method in the SavingsAccount subclass.
 */
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance && balance >= 100) {
            balance -= amount;
            System.out.println("Withdrawn from Savings Account: $" + amount);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (balance < 100) {
            System.out.println("Withdrawal not allowed. Minimum balance of $100 required.");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Create a BankAccount
        BankAccount account1 = new BankAccount(500);
        account1.deposit(200);
        account1.withdraw(300);
        System.out.println("Bank Account Balance: $" + account1.getBalance());

        SavingsAccount account2 = new SavingsAccount(300);
        account2.deposit(50);
        account2.withdraw(75); // Should not allow withdrawal
        System.out.println("Savings Account Balance: $" + account2.getBalance());

        account2.withdraw(50); 
        System.out.println("Savings Account Balance: $" + account2.getBalance());
    }
}
