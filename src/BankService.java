import java.util.ArrayList;

public class BankService {
    private ArrayList<BankAccount> accountlist;
    private InputUtils inputs;

    public BankService(){
        this.accountlist = new ArrayList<>();
    }

    public BankAccount searchForAccount(String accountNumber){
        for (BankAccount bankAccount : accountlist) {
            if(accountNumber.equals(bankAccount.getAccountNumer())){
                System.out.println("Account founded");
                return bankAccount;
            }
        }
        System.out.println("Account not found");
        return null;
    }

    public void deposit(double amount){
        System.out.println("Enter the account name: ");
        String accountTargetName = inputs.geString();
        BankAccount targetAccount= searchForAccount(accountTargetName);
        if ( targetAccount == null) {
            System.out.println("Account not found2");
        }
        else{
            targetAccount.deposit(amount);  
        }
    }

    
    public void createSavingAccount(){
        System.out.println("Enter account number: ");
        String accountNumber = inputs.geString();
        System.out.println("Enter initial balance: ");
        double balance = inputs.getDouble();

        System.out.println("Choose an account:");
        System.out.println("enter 1 for a SavingsAccount or 2 for CurrentAccount");
        String choice = inputs.geString();

        if (choice.equals("1")){
            accountlist.add(new SavingsAccount(accountNumber, balance, choice)); 
        }
        else if (choice.equals("2")){

        }
        else{ System.out.println("Invalid input");}



    }

}
