public class OverloadingDemo {
    public static void main(String[] args) {

        boolean ok;
        BankAccount bankAcc = new BankAccount("123","Ordinary Account Holder");
        GoldAccount goldAcc = new GoldAccount("124","Gold Account Holder",500);

        bankAcc.deposit(1000);
        goldAcc.deposit(1000);
        ok = bankAcc.withdraw(1250);
        if(ok){
            System.out.println("Money withdrawn.");
        }
        else {
            System.out.println("Insufficient funds");
        }
        System.out.println("Balance of "+bankAcc.getAccountName()+" is "+bankAcc.getBalance());
        System.out.println();
        ok = goldAcc.withdraw(1250);
        if(ok){
            System.out.println("Money withdrawn.");
        }
        else {
            System.out.println("Insufficient funds.");
        }
        System.out.println("Balance of "+goldAcc.getAccountName()+" is "+goldAcc.getBalance());
    }


}
