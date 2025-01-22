 class SalaryAccount extends Account {
    public SalaryAccount(String accountNumber, double balance) {

        super(accountNumber,balance);
    }

    @Override
    public void getAccountDetails() {
        System.out.println("Salary Account Number: " + getAccountNumber());
        System.out.println("Salary Account Balance: " + getBalance());
    }


 }
