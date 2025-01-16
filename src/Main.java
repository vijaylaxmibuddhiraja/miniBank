public class Main {
    public static void main(String[] args) {
        SalaryAccount salAccount = new SalaryAccount(10000);
        salAccount.getAccountDetails();

       salAccount.deposit(5000);
       salAccount.getAccountDetails();
       //System.out.println("Balance after deposit the amount : ");
       salAccount.getAccountDetails();
       salAccount.withdraw(950);
       salAccount.getAccountDetails();

    }
}