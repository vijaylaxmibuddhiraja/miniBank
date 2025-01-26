import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        SalaryAccount salAccount = new SalaryAccount("SAL1024",50000);
        // SavingsAccount savAccount = new SavingsAccount("SAV1088",250000);
        //User user = new User("201706157654","7659");
        Scanner scan = new Scanner(System.in);
        UserLogin userLogin = new UserLogin();
        ManageAccount manageAccount = new ManageAccount(userLogin);


        userLogin.addUser("200506028769", "3456", 20000.0, 500000.0);
        userLogin.addUser("195605175678", "8584", 35000.0, 275000.0);
        userLogin.addUser("198611219876", "9876", 89000.0, 1500000.0);
     /*  userLogin.addUser("200112137685", "9286");
        System.out.println("Display added users: ");
        for (User user : userLogin.getUsers()) {
            System.out.println("Social Security Number: " + user.getSocialSecurityNumber());
        }*/

        /*System.out.println("\nRemove user with SSN: ");
        userLogin.removeUser("");

        System.out.println("Displaying Users after removal: ");*/
        

      /* salAccount.getAccountDetails();

        salAccount.deposit(5000);
        salAccount.getAccountDetails();

       /* salAccount.withdraw(950);
        salAccount.getAccountDetails();


       /* savAccount.getAccountDetails();

        savAccount.deposit(20000);
        savAccount.getAccountDetails();

        savAccount.withdraw(10000);
        savAccount.getAccountDetails();

        System.out.println("New User with SSN : " + user.getSocialSecurityNumber());
        System.out.println("Accounts automatically generated: ");
        for(Account account : user.getAccounts()) {
            System.out.println(account);
        }*/


        while (true) {
            System.out.println("\nWelcome to the Mini Bank--");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.println("3.Enter your choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                int attempts = 0;

                while (attempts < 3) {
                    System.out.print("Enter Social Security Number: ");
                    String ssn = scan.nextLine();

                    if (!userLogin.isUserExists(ssn)){
                        System.out.println("Social Security Number does not exist");
                        continue;
                    }

                    System.out.print("Enter PIN: ");
                    String pin = scan.nextLine();

                    User loggedInUser = userLogin.login(ssn, pin, attempts);

                    if (loggedInUser != null) {
                        System.out.println("Login successful!");
                        System.out.println("Welcome, User: " + loggedInUser.getSocialSecurityNumber());

                       // userLogin.showAccounts(loggedInUser);  // to show user acc
                        manageAccount.manageAccount(loggedInUser);
                        break;
                    } else {
                        attempts++;
                        if (attempts < 3) {
                            System.out.println("Invalid Pin, Attempts left: " + (3 - attempts));
                        } else {
                            System.out.println("Too many attempts, try again");
                        }
                    }
                }

            } else if (choice == 2) {
                System.out.println("Exit the program");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

            scan.close();
        }

    }


