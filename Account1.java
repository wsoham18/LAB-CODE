package test;

import java.util.Scanner;

public class Account {
    String account;
    String accountHolder;
    double balance;

    Account(String acc, String acc_ho, double bal) {
        string account = acc;
        string accountHolder = acc_ho;
        double balance = bal;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn " + amount);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void displaybalance() {
        System.out.println("Account: " + account + ", Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner dp = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        String account1 = dp.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolder1 = dp.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance1 = dp.nextDouble();

        Account acc1 = new Account(account1, accountHolder1, balance1);
        acc1.displaybalance();

        System.out.print("Enter deposit amount: ");
        acc1.deposit(dp.nextDouble());

        System.out.print("Enter withdrawal amount: ");
        acc1.withdraw(dp.nextDouble());

        acc1.displaybalance();

        
    }
}
