public class Main {


    public static void main(String[] args) {

        SalaryAccount salAccount = new SalaryAccount("Nit1024",50000);

        salAccount.getAccountDetails();

        salAccount.deposit(5000);
        salAccount.getAccountDetails();

        salAccount.getAccountDetails();
        salAccount.withdraw(950);
        salAccount.getAccountDetails();
    }
}
