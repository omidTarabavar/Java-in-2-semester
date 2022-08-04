package Chapter13;

public class TestResetable {
    public static void main(String[] args) {
        Oblong oblong =new Oblong(20,10);
        BankAccount bankAccount =new BankAccount("1234","omid");
        bankAccount.deposit(200);
        resetObject(() -> {
            oblong.setHeight(1);
            oblong.setLength(1);
        });
        resetObject(() -> {
            bankAccount.withdraw(bankAccount.getBalance());
        });
        System.out.println(oblong+"\n");
        System.out.println(bankAccount);

    }
    static void resetObject(Resetable object){
        object.reset();
    }
}
