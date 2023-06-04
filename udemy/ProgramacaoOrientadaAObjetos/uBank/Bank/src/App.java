import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class App {  
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Welcome to uBank!");
        System.out.println("To open your account, please input the data required below:");
        System.out.println("Account number:");
        int accountNumber = sc.nextInt();
        System.out.println("Name:");
        sc.nextLine();
        String holderName = sc.nextLine();
        System.out.println("Do you wish to make a deposit? (y/n)");
        char answer = sc.next().charAt(0);
        if(answer == 'y'){
            System.out.println("Inform the value of the deposit:");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, holderName, initialDeposit);
        }
        else {
            account = new Account(accountNumber, holderName);
        }
        
        System.out.println("Account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        
        System.out.println("Updated account data:");
        System.out.println(account);
         
        sc.close();
    }
}
