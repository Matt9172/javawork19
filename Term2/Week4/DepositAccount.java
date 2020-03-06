package Week4;

public class DepositAccount extends BankAccount{
    private double interest;

    public DepositAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.interest = interest;
    }

    public void addInterest(double interestRate){
        interest = interestRate / 100;
    }
    public void calcInterest(){
        double intrs = getBalance() * interest;
        System.out.println(intrs);
    }
    public void totalBalance(){

    }







}
