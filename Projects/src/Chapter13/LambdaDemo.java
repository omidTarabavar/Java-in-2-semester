package Chapter13;

public class LambdaDemo {
    public static void main(String[] args) {
        Oblong testOblong = new Oblong(8,8);
        System.out.println("oblong is "+checkValidity(() -> {
            return testOblong.getLength() >0 && testOblong.getHeight() > 0;
        }));
        System.out.println("oblong is "+checkValidity(() -> {
            return testOblong.getLength() != testOblong.getHeight();
        }));
    }

    private static String checkValidity(Checkable object){
        if(object.check()){
            return "valid";
        }else {
            return "invalid";
        }
    }
}
