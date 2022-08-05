package Chapter13;

public class AnonymousClassDemoVersion1 {
    public static void main(String[] args) {
        Customer testCustomer = new Customer("2A13","Omid",200);
        Checkable checkableObject1 =new Checkable() {
            @Override
            public boolean check() {
                int numberCount = 0;
                int letterCount = 0;
                if(testCustomer.getCustomerId().length() != 4){
                    return false;
                }else {
                    for(int i = 0 ; i < testCustomer.getCustomerId().length();i++){
                        if(Character.isLetter(testCustomer.getCustomerId().charAt(i))){
                            letterCount += 1;
                        }else if(Character.isDigit(testCustomer.getCustomerId().charAt(i))){
                            numberCount += 1;
                        }
                    }
                }
                return (numberCount == 3 && letterCount == 1);
            }
        };
        System.out.println(checkValidity(checkableObject1));
    }

    private static String checkValidity(Checkable object){
        if(object.check()){
            return "valid";
        }else {
            return "invalid";
        }
    }
}
