package Chapter15.ProgrammingExercises;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    public static void main(String[] args) {
        Map<String,BankAccount> bankAccountMap = new HashMap<>();
        BankAccount account1 = new BankAccount("001","Omid");
        account1.deposit(200);
        BankAccount account2 = new BankAccount("002","Mmd");
        account2.deposit(50);
        bankAccountMap.put(account1.getAccountNumber(),account1);
        bankAccountMap.put(account2.getAccountNumber(),account2);
        System.out.println(bankAccountMap);
        bankAccountMap.forEach((bankAccNumber,bankAccount) ->{
            if(bankAccount.balance > 100){
                System.out.println(bankAccount);
            }
        });
    }
}
