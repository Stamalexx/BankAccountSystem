import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean isOn = true;
        BankService bService = new BankService();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to bankPasok");
        // String [] choiceList = {"1","2","3","4","5"};
        while (isOn) {
            
            System.out.println("From the following menu please enter the NUMBER of the service that you like");
            System.out.println("1. Create Account\r\n" + //
                                "2. Deposit Money\r\n" + //
                                "3. Withdraw Money\r\n" + //
                                "4. Check Balance\r\n" + //
                                "5. Exit\r\n");

            String userChoice = sc.nextLine();
            
            switch (userChoice) {
                case "1":
                    bService.createAccount();
                    break;
                case "2":
                    System.out.println("Enter the amount that you want to deposit");
                    bService.changeAmount(sc.nextInt(), "2");
                    break;

                case "3":
                    System.out.println("Enter the amount that you want to withdraw");
                    bService.changeAmount(sc.nextInt(), "1");
                    sc.nextLine();
                    break;

                case "4":
                    bService.showBalancesAll();
                    break;
                case "5":
                    isOn = false;
                    break;    
                default:
                    System.out.println("invalid option");
                    break;
            }

}
}}
