public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountNumer, double balance, String accountHolderName){
        super(accountNumer, balance, accountHolderName);
    }

    @Override
    public void withdraw(double amount) {
        if(super.getBalance() - amount >= 100){
            super.setBalance(super.getBalance() - amount);

        }
        else {
            System.out.println("Insufficient funds. Minimum balance of $100 required.");
            
        }
        
    }
    
    
}
