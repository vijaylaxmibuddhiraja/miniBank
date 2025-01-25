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
    }*/

    public ArrayList<User> getUsers() {
        return users;
    }

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


        }




