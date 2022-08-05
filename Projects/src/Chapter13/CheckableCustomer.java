package Chapter13;

public class CheckableCustomer extends Customer implements Checkable{
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
