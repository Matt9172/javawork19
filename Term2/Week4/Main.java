package Week4;

public class Main {
    public static void main(String[] args) {
        DepositAccount matt = new DepositAccount("","Matt",100);
        matt.addInterest(5);
        matt.calcInterest();
        matt.totalBalance();
    }
}
