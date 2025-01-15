 class SalaryAccount extends Account {
    public SalaryAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public void getAccountType() {
        System.out.println("Salary Account : " + getAccountNumber() + ", Balance:" + getBalance());
    }
}
