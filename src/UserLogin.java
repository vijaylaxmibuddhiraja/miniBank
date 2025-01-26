import java.util.ArrayList;

public class UserLogin {
    private ArrayList<User> users;

    public UserLogin() {
        users = new ArrayList<>();
    }

    public void addUser(String SocialSecurityNumber, String securityPin, double salaryBalance, double savingsBalance) {
        User user = new User(SocialSecurityNumber, securityPin, salaryBalance, savingsBalance);
        users.add(user);
       /* users.add(new User(SocialSecurityNumber, securityPin, salaryBalance, savingsBalance));
        System.out.println("User added successfully.");*/
    }

    /*public void removeUser(String SocialSecurityNumber) {
        for (User user : users) {
            if (user.getSocialSecurityNumber().equals(SocialSecurityNumber)) {
                users.remove(user);
                System.out.println("User removed successfully.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    public ArrayList<User> getUsers() {
        return users;
    }*/

    public boolean isUserExists(String SocialSecurityNumber) {
            for (User user : users) {
                if (user.getSocialSecurityNumber().equals(SocialSecurityNumber)) {
                    return true;
                }
            }
            return false;
    }

    public User login(String SocialSecurityNumber, String securityPin, int attempts) {
            if (attempts > 3) {
                return null;
            }
            for (User user : users) {
                if (user.getSocialSecurityNumber().equals(SocialSecurityNumber) && user.validateSecurityPin(securityPin)) {
                    return user;
                }
            }
            return null;
    }

    public void showAccounts(User user) {
            for (Account account : user.getAccounts()) {
                System.out.println("Account number:  " + account.getAccountNumber() + "Balance:  " + account.getBalance());
            }
    }

    public boolean deposit(User user, String accountType, double amount) {
        Account account = user.accountChoice(accountType);
                if (account != null) {
                    account.deposit(amount);
                    return true;
                }
                return false;
    }

    public boolean withdraw(User user, String accountType, double amount) {
        Account account = user.accountChoice(accountType);
                if (account != null && account.getBalance() >= amount) {
                    account.withdraw(amount);
                    return true;
                }
                return false;
    }

    public void updateBalance(User user, String accountType) {
        Account account = user.accountChoice(accountType);
                if (account != null) {
                    System.out.println("Current balance for " + accountType + " account: Rs." + account.getBalance());
                } else {
                    System.out.println("Account not found.");
                }
    }

    private User findUserBySSN(String ssn) {
                for (User user : users) { // Assuming `users` is your list of registered users
                    if (user.getSocialSecurityNumber().equals(ssn)) {
                        return user;
                    }
                }
                return null;
    }


    public boolean transfer(User sender, String mainAccountType, String recipientSocialSecurityNumber, String recipientAccountType, double amount) {
                if (sender == null) {
                    System.out.println("Invalid sender.");
                    return false;
                }


        Account senderAccount = sender.accountChoice(mainAccountType);
                 if (senderAccount == null || senderAccount.getBalance() < amount) {
                      System.out.println("Invalid sender or insufficient balance.");
                      return false;
                 }

        User recipient = findUserBySSN(recipientSocialSecurityNumber);
                if (recipient == null) {
                    System.out.println("Recipient not found.");
                    return false;
                }

        Account recipientAccount = recipient.accountChoice(recipientAccountType);
                if (recipientAccount == null) {
                    System.out.println("Recipient account type invalid.");
                    return false;
                }

           try {
                senderAccount.withdraw(amount);
                recipientAccount.deposit(amount);
                System.out.println("Successfully transferred Rs. " + amount +  " from " + mainAccountType + " to " + recipientAccount);
                return true;
           } catch (Exception e) {
               System.out.println("Transfer failed." + e.getMessage());
               return false;
           }
        }
    }






