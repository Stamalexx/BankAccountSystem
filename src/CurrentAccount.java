public class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumer, double balance, String accountHolderName){
        super(accountNumer, balance, accountHolderName);
    }

    @Override
    public void withdraw(double amount) {
        if(super.getBalance() - amount >= -500) {
        super.setBalance(super.getBalance() - amount);
    } else {
        System.out.println("Overdraft limit exceeded.");
    }
    }
    

    
}
