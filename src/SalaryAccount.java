class SalaryAccount extends Account {

    public SalaryAccount(String accountNumber, double balance) {

        super(accountNumber,balance);
    }

    @Override
    public String getAccountDetails() {
        return "Salary Account";
        /*System.out.println("Salary Account Number: " + getAccountNumber());
        System.out.println("Salary Account Balance: " + getBalance());*/
    }


 }
