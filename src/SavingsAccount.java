class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void getAccountDetails() {
        System.out.println("Savings Account Number: " + getAccountNumber());
        System.out.println("Savings Account Balance: " + getBalance());
    }
}
