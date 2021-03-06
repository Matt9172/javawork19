package Week4;

import java.util.Random;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber() {
        this.accountNumber = generateAccountNumber();
    }

    private String generateAccountNumber  (){
        String acc = "";
        Random rg = new Random();
        for (int i = 0; i < 9; i ++) {
            acc += rg.nextInt(10);
        }
        return acc;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    private boolean deposit(double amount){
        if (amount > 0.0){
            this.balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    private boolean withdraw(double amount){
        if (amount > 0.0){
            this.balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }
}

