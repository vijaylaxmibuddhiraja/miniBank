import java.util.ArrayList;

public class User {
    private final String socialSecurityNumber;
    private String securityPin;
    private ArrayList<Account> accounts;

    public User(String socialSecurityNumber, String securityPin, double salaryBalance, double savingsBalance) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.securityPin = securityPin;
        this.accounts = new ArrayList<>();

        accounts.add(new SalaryAccount(generateAccountNumber("SAL"),salaryBalance));
        accounts.add(new SavingsAccount(generateAccountNumber("SAV"), savingsBalance));   //adding accs with initial balance
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public boolean validateSecurityPin(String securityPin) {
        return this.securityPin.equals(securityPin);
    }

    public void updateSecurityPin(String newPin) {   //or reset pin but not yet done
        this.securityPin = newPin;

    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    private String generateAccountNumber(String prefix) {    //for unique acc nos
        return prefix + (int) (Math.random() * 1000);

    }

    public Account accountChoice(String accountType) {
        for (Account account : accounts) {
            if((accountType.equalsIgnoreCase("Salary") && account instanceof SalaryAccount) || (accountType.equalsIgnoreCase("Savings") && account instanceof SavingsAccount)) {
                return account;
            }
        }
        return null;
    }


    }

