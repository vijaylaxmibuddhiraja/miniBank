public abstract class Account {
   private static long accCounter = 1000000000;
    private final String accountNumber;
    private double balance;

    public Account(double balance) {
        this.accountNumber = String.format("%010d", accCounter++);
        this.balance = balance;
    }

   public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }else{
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }else{
            System.out.println("Insufficient amount");
        }
    }

public abstract void getAccountDetails();

}
