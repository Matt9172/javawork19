package Week4;

public class DepositAccount extends BankAccount{
    private double interest;

    public DepositAccount(String accountNumber, String accountHolder, double balance, double interest) {
        super(accountNumber, accountHolder, balance);
        this.interest = interest;
    }

    private void addInterest(double interestRate){
        interest = interestRate / 100;
    }




}
