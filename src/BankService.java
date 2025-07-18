import java.util.ArrayList;

public class BankService {
    private ArrayList<BankAccount> accountlist;
    private InputUtils inputs = new InputUtils();
    

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
    public void changeAmount(double amount,String type){
        ///type 1 = withdraw, type 2 = deposit ///
        System.out.println("Enter the account name: ");
        String accountTargetName = inputs.geString();
        BankAccount targetAccount= searchForAccount(accountTargetName);
        if ( targetAccount == null) {
            System.out.println("Account not found2");
        }

        else if (type == "1"){
            targetAccount.withdraw(amount); 
        }

        else if (type == "2"){
            targetAccount.deposit(amount);

        }
        else
        System.out.println("error in changeamount");
    }

    public void showBalancesAll(){
        for (BankAccount bankAccount : accountlist) {
            System.out.println( "Account number: " + bankAccount.getAccountNumer() + 
            "\nBanalnce: " + bankAccount.getBalance());
        }

    }

       
    public void createAccount(){
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
            accountlist.add(new CurrentAccount(accountNumber, balance, choice)); 

        }
        else{ System.out.println("Invalid input");}



    }

}
