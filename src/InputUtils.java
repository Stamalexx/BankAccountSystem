import java.util.Scanner;

public class InputUtils {
    Scanner sc = new Scanner(System.in);
    public InputUtils(){

    }

    public String geString(){
        String input = sc.nextLine();
        return input;    
    }

    public int getInt(){
        int input = sc.nextInt();
        sc.nextLine();
        return input;    
    }

    public double getDouble() {
        double input = sc.nextDouble();
        sc.nextLine();
        return input;
    }




}
