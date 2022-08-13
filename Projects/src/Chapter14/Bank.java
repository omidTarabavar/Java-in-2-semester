package Chapter14;

import java.util.ArrayList;
import java.util.Optional;

public class Bank {

    ArrayList<BankAccount> list = new ArrayList<>();

    private int search(String accountNumberIn){
        for(int i = 0 ;i< list.size();i++){
            BankAccount tempAccount = list.get(i);
            String tempNumber = tempAccount.getAccountNumber();
            if(tempNumber.equals(accountNumberIn)){
                return i;
            }
        }
        return -999;
    }

    public int getTotal(){
        return list.size();
    }

    public Optional<BankAccount> getItem(String accountNumberIn){
        int index = search(accountNumberIn);
        if(index != -999){
            return Optional.of(list.get(index));
        }
        else {
            return Optional.empty();
        }
    }

    public boolean addAccount(String accountNumberIn,String nameIn){
        if(search(accountNumberIn) == -999){
            list.add(new BankAccount(accountNumberIn,nameIn));
            return true;
        }
        return false;
    }

    public boolean depositMoney(String accountNumberIn,double amountIn){
        if(getItem(accountNumberIn).isPresent()){
            BankAccount acc = getItem(accountNumberIn).get();
            acc.deposit(amountIn);
            return true;
        }else {
            return false;
        }
    }

    public int withDrawMoney(String accountNumberIn,double amountIn){
        if(getItem(accountNumberIn).isPresent()){
            BankAccount acc = getItem(accountNumberIn).get();
            if(acc.getBalance() < amountIn){
                return -1;
            }else {
                acc.withdraw(amountIn);
                return 1;
            }
        }else {
            return 0;
        }
    }

    public boolean removeAccount(String accountNumberIn){
        int index = search(accountNumberIn);
        if(index != -999){
            list.remove(index);
            return true;
        }
        else {
            return false;
        }
    }





}
