package Chapter14;

import java.util.Scanner;

public class NullPointerDemoWithOptional {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Bank myBank = new Bank();
        myBank.addAccount("001","Aaron");
        myBank.addAccount("002","Quentin");
        System.out.print("Enter account number to search for: ");
        String account = keyboard.next();
        myBank.getItem(account).ifPresent(value -> System.out.println(value.getAccountName()));
    }
}
