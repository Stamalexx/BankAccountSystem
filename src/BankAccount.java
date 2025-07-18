public abstract class BankAccount {
    private String accountNumer;
    private double balance;
    private String accountHolderName;
    
    
    public BankAccount(String accountNumer, double balance, String accountHolderName) {
        this.accountNumer = accountNumer;
        this.balance = balance;
        this.accountHolderName = accountHolderName;
    }
    public String getAccountNumer() {
        return accountNumer;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountHolderName() {
        return accountHolderName;
    }


    public void setAccountNumer(String accountNumer) {
        this.accountNumer = accountNumer;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    



    
}
