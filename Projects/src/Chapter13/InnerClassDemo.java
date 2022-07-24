package Chapter13;

public class InnerClassDemo {

    public static void main(String[] args) {
        // inner class
        class CheckableOblong extends Oblong implements Checkable{
            public CheckableOblong(double lengthIn, double heightIn) {
                super(lengthIn, heightIn);
            }

            @Override
            public boolean check() {
                return getLength() > 0 && getHeight() > 0;
            }
        }
        Checkable oblong1 = new CheckableOblong(5,0);
        Checkable oblong2 = new CheckableOblong(5,6);

        System.out.println("oblong1 is "+checkValidity(oblong1));
        System.out.println("oblong2 is "+checkValidity(oblong2));
    }
    public static String checkValidity(Checkable object){
        if(object.check()){
            return "valid";
        }else {
            return "invalid";
        }
    }
    }


