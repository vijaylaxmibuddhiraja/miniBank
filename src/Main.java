public class Main {


    public static void main(String[] args) {

       SalaryAccount salAccount = new SalaryAccount("Nit1024",50000);
        salAccount.getAccountDetails();

        salAccount.deposit(5000);
        salAccount.getAccountDetails();

        salAccount.withdraw(950);
        salAccount.getAccountDetails();

        SavingsAccount savAccount = new SavingsAccount("Nit1088",250000);
        savAccount.getAccountDetails();

        savAccount.deposit(20000);
        savAccount.getAccountDetails();

        savAccount.withdraw(10000);
        savAccount.getAccountDetails();

    }
}
