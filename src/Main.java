public class Main {


    public static void main(String[] args) {

       SalaryAccount salAccount = new SalaryAccount("Nit1024",50000);
       SavingsAccount savAccount = new SavingsAccount("Nit1088",250000);
       User user = new User("201706157654","7659");


       salAccount.getAccountDetails();

        salAccount.deposit(5000);
        salAccount.getAccountDetails();

        salAccount.withdraw(950);
        salAccount.getAccountDetails();


        savAccount.getAccountDetails();

        savAccount.deposit(20000);
        savAccount.getAccountDetails();

        savAccount.withdraw(10000);
        savAccount.getAccountDetails();

        System.out.println("New User with SSN : " + user.getSocialSecurityNumber());
        System.out.println("Accounts automatically generated: ");
        for(Account account : user.getAccounts()) {
            System.out.println(account);
        }

    }
}
