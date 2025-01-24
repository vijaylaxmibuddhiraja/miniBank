public class Main {


    public static void main(String[] args) {

      // SalaryAccount salAccount = new SalaryAccount("SAL1024",50000);
      // SavingsAccount savAccount = new SavingsAccount("SAV1088",250000);
       //User user = new User("201706157654","7659");
       UserLogin userLogin = new UserLogin();

       userLogin.addUser("200506028769", "3456");
        System.out.println("Display all users: ");
        for (User user : userLogin.getUsers()) {
            System.out.println("Social Security Number: " + user.getSocialSecurityNumber());
        }

      /* salAccount.getAccountDetails();

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
        }*/



    }
}
