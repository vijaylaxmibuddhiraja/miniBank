import java.util.Scanner;

public class ManageAccount {
    private UserLogin login;
    private Scanner scan;

    public ManageAccount(UserLogin userLogin) {
        this.login = userLogin;
        scan = new Scanner(System.in);
    }

    public void manageAccount(User user) {
        while (true) {
            System.out.println("Manage your account:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Make a transaction");
            System.out.println("5. Go Back");
            System.out.println("Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    deposit(user);
                    break;
                case 2:
                    withdraw(user);
                    break;
                case 3:
                    checkBalance(user);
                    break;
                case 4:
                    makeTransfer(user);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private void deposit(User user) {
        System.out.print("Enter account type (salary/savings): ");
        String accountType = scan.nextLine();
        System.out.print("Money Deposited: Rs. ");
        double amount = scan.nextDouble();
        scan.nextLine(); //

        if (login.deposit(user, accountType, amount)) {      // used instance of UserLogin to not make deposit, withdraw and update balance static
            System.out.println("Deposit successful.");
            login.updateBalance(user, accountType);
        } else {
            System.out.println("Deposit failed. Please check the account type.");
        }
    }

    private void withdraw(User user) {
        System.out.print("Enter account type (salary/savings): ");
        String accountType = scan.nextLine();
        System.out.print("Withdraw Money: Rs. ");
        double amount = scan.nextDouble();
        scan.nextLine();

        if (login.withdraw(user, accountType, amount)) {
            System.out.println("Withdrawal successful.");
            login.updateBalance(user, accountType);
        } else {
            System.out.println("Withdrawal failed. Please check the account type and balance.");
        }
    }

    private void checkBalance(User user) {
        System.out.print("Enter account type (salary/savings): ");
        String accountType = scan.nextLine();
        login.updateBalance(user, accountType);
    }

    private void makeTransfer(User user) {
        System.out.println("Enter account type (salary/savings): ");
        String mainAccountType = scan.nextLine();

        Account mainAccount = user.accountChoice(mainAccountType);
        if (mainAccount == null) {
            System.out.println("Invalid account type");
            return;
        }

        System.out.println("Enter amount to be transferred: ");
        double amount = scan.nextDouble();
        scan.nextLine();

        System.out.println("Enter recipient's Social Security Number: ");
        String recipientSocialSecurityNumber = scan.nextLine();

        System.out.println("Enter recipient's account type: ");
        String recipientAccountType = scan.nextLine();

        if (login.transfer(user, mainAccountType, recipientSocialSecurityNumber, recipientAccountType, amount)) {
            System.out.println("Transfer successful.");
        } else {
            System.out.println("Transfer failed. Please check the account type.");
        }
    }
}
