package Chapter13;

public class Checker {
    public static void main(String[] args) {
        CheckableOblong oblong1 = new CheckableOblong(10,8);
        CheckableOblong oblong2 = new CheckableOblong(0 , 8);

        CheckableBankAccount account1 = new CheckableBankAccount("12345678","Smith");
        CheckableBankAccount account2 = new CheckableBankAccount("S1234567","Patel");
        CheckableBankAccount account3 = new CheckableBankAccount("1234567","Adewale");

        System.out.println("oblong1 is "+ checkValidity(oblong1));
        System.out.println("oblong2 is "+ checkValidity(oblong2));
        System.out.println("account1 is "+ checkValidity(account1));
        System.out.println("account2 is "+ checkValidity(account2));
        System.out.println("account3 is "+ checkValidity(account3));

    }

    private static String checkValidity(Checkable objectIn){
        if(objectIn.check()){
            return "valid";
        }else {
            return "invalid";
        }
    }
}
