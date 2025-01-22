import java.util.ArrayList;

public class User {
    private final String socialSecurityNumber;
    private String securityPin;
    private ArrayList<Account> accounts;

    public User(String socialSecurityNumber, String securityPin) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.securityPin = securityPin;
        this.accounts = new ArrayList<>();

        accounts.add(new SalaryAccount(generateAccountNumber(),0.0));
        accounts.add(new SavingsAccount(generateAccountNumber(), 0.0));
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public boolean validateSecurityPin(String securityPin) {
        return this.securityPin.equals(securityPin);
    }

    public void updateSecurityPin(String newPin) {
        this.securityPin = newPin;

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
    private String generateAccountNumber() {
            return "NIT" + (int)(Math.random() * 1000);

        }
    }

