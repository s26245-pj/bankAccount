package pl.pjait;

import java.util.Scanner;

public class BankAccount {
    private String id;
    private String bankAccountNum;
    private double balance;

    BankAccount(String id, String bankAccountNum, double balance) {
        this.id = id;
        this.bankAccountNum = bankAccountNum;
        this.balance = balance;
    }

    public void deposit(){
        Scanner input = new Scanner(System.in);
        System.out.println("Your balance: " + this.balance);
        System.out.println("Enter amount you want to deposit: ");
        double amount = input.nextDouble();
        while (amount <= 0) {
            System.out.println("You need to input positive number");
            amount = input.nextDouble();
        }
        this.balance = balance + amount;
        System.out.println("Your balance after deposit: " + this.balance);
    }

    public void withdraw(){
        Scanner input = new Scanner(System.in);
        System.out.println("Your balance: " + this.balance);
        System.out.println("Enter amount you want to withdraw: ");
        double amount = input.nextDouble();
        while (amount <= 0 || amount > this.balance) {
            if (amount > this.balance) {
                System.out.println("It's more than you have, your balance is " + this.balance);
            } else {
                System.out.println("You need to input positive number");
            }
            amount = input.nextDouble();
        }
        this.balance = balance - amount;
        System.out.println("Your balance after withdrawal: " + this.balance);
    }

   // public void transfer(double balance, double balance)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }
}
