package Chapter13;

public class AnonymousClassDemoVersion1 {
    public static void main(String[] args) {
        Oblong testOblong = new Oblong(8,8);

        Checkable checkableObject1 = new Checkable() {
            @Override
            public boolean check() {
                return testOblong.getHeight() > 0 && testOblong.getLength() > 0;
            }
        };

        Checkable checkableObject2 = new Checkable() {
            @Override
            public boolean check() {
                return testOblong.getLength() != testOblong.getHeight();
            }
        };

        System.out.println("checkableObject1 is "+checkValidity(checkableObject1));
        System.out.println("checkableObject2 is "+checkValidity(checkableObject2));
    }

    private static String checkValidity(Checkable object){
        if(object.check()){
            return "valid";
        }else {
            return "invalid";
        }
    }
}
