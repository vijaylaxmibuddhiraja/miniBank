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

  /* public void removeUser(String SocialSecurityNumber) {
        for (User user : users) {
            if (user.getSocialSecurityNumber().equals(SocialSecurityNumber)) {
                users.remove(user);
                System.out.println("User removed successfully.");
                return;
            }
        }
        System.out.println("User " + SocialSecurityNumber + " not found.");
    }

    public User searchUser(String SocialSecurityNumber) {
        for (User user : users) {
            if (user.getSocialSecurityNumber().equals(SocialSecurityNumber)) {
                return user;
            }
        }
        return null;
    }

    public boolean checkUser(String SocialSecurityNumber, String securityPin) {
        User user = searchUser(SocialSecurityNumber);
        return user != null && user.validateSecurityPin(securityPin);
    }

    public void updateUserPin(String SocialSecurityNumber, String securityPin) {
        User user = searchUser(SocialSecurityNumber);
        if (user != null) {
            user.updateSecurityPin(securityPin);
            System.out.println("User's security pin updated successfully.");
        }else{
            System.out.println("User not found.");
        }
    }*/

    public ArrayList<User> getUsers() {
        return users;
    }


}
