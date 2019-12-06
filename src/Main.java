public class Main {
    public static void main(String[] args) {

        BankAccount jeff = new BankAccount();
        jeff.setAccountNumber();
        jeff.setAccountHolder("Jeff");
        System.out.println(jeff.getAccountNumber());
        System.out.println(jeff.getAccountHolder());

        BankAccount josh = new BankAccount();
        josh.setAccountNumber();
        josh.setAccountHolder("Josh");
        System.out.println(josh.getAccountNumber());
        System.out.println(josh.getAccountHolder());
    }
}
