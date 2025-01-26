import java.util.ArrayList;

public class UserLogin {
    private ArrayList<User> users;

    public UserLogin() {
        users = new ArrayList<>();
    }

    public void addUser(String SocialSecurityNumber, String securityPin, double salaryBalance, double savingsBalance) {
        users.add(new User(SocialSecurityNumber, securityPin, salaryBalance, savingsBalance));
        System.out.println("User added successfully.");
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
            System.out.println("Account number: " + account.getAccountNumber() + "Balance: " + account.getBalance());
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
            System.out.println("Current balance for " + accountType + " account: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

        }




