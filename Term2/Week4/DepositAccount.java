package Week4;

public class DepositAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

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
