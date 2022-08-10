package Chapter14;

import java.util.Scanner;

public class NullPointerDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Bank myBank = new Bank();
        myBank.addAccount("001","Aaron");
        myBank.addAccount("002","Quentin");
        System.out.print("Enter account number to search for: ");
        String account = keyboard.next();
        if(myBank.getItem(account) != null){
            System.out.println(myBank.getItem(account).getAccountName());
        }
    }
}
