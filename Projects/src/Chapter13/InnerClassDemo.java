package Chapter13;

public class InnerClassDemo {

    public static void main(String[] args) {
        // inner class
        class CheckableCustomer extends Customer implements Checkable{
            public CheckableCustomer(String id, String name, double creditLimit) {
                super(id, name, creditLimit);
            }

            @Override
            public boolean check() {
                int numberCount = 0;
                int letterCount = 0;
                if(getCustomerId().length() != 4){
                    return false;
                }else {
                    for(int i = 0 ; i < getCustomerId().length();i++){
                        if(Character.isLetter(getCustomerId().charAt(i))){
                            letterCount += 1;
                        }else if(Character.isDigit(getCustomerId().charAt(i))){
                            numberCount += 1;
                        }
                    }
                }
                return (numberCount == 3 && letterCount == 1);
            }
        }
        Checkable customer1 = new CheckableCustomer("12A3","Omid",200);
        Checkable customer2 = new CheckableCustomer("1234","Mohammad",230);
        Checkable customer3 = new CheckableCustomer("A2B3","Ali",330);

        System.out.println(checkValidity(customer1));
        System.out.println(checkValidity(customer2));
        System.out.println(checkValidity(customer3));

    }
    public static String checkValidity(Checkable object){
        if(object.check()){
            return "valid";
        }else {
            return "invalid";
        }
    }
    }


