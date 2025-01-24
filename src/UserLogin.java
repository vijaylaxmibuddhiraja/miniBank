import java.util.ArrayList;

public class UserLogin {
    private ArrayList<User> users;

    public UserLogin() {
        users = new ArrayList<>();
    }

    public void addUser(String SocialSecurityNumber, String securityPin) {
        users.add(new User(SocialSecurityNumber, securityPin));
        System.out.println("User logged in successfully.");
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




