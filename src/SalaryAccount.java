 class SalaryAccount extends Account {
    public SalaryAccount(double balance) {

        super(balance);
    }

    @Override
    public void getAccountDetails() {
        System.out.println("Salary Account Number: " + getAccountNumber());
        System.out.println("Salary Account Balance: " + getBalance());
    }


 }
