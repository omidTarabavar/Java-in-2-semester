package Chapter13;

public class Checker {
    public static void main(String[] args) {
        CheckableCustomer customer1 = new CheckableCustomer("1A23","Omid",200);
        CheckableCustomer customer2 = new CheckableCustomer("1234","Mohammad",250);
        CheckableCustomer customer3 = new CheckableCustomer("AB12","Ali",350);
        System.out.println(checkValidity(customer1));
        System.out.println(checkValidity(customer2));
        System.out.println(checkValidity(customer3));



    }

    private static String checkValidity(Checkable objectIn){
        if(objectIn.check()){
            return "valid";
        }else {
            return "invalid";
        }
    }
}
