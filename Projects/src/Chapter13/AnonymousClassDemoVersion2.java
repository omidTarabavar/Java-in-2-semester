package Chapter13;

public class AnonymousClassDemoVersion2 {
    public static void main(String[] args) {
        Oblong oblong = new Oblong(8,8);
        System.out.println("oblong base on check 1 is "+checkValidity(new Checkable() {
            @Override
            public boolean check() {
                return oblong.getHeight() > 0 && oblong.getLength() > 0;
            }
        }));
        System.out.println("oblong base on check 2 is "+checkValidity(new Checkable() {
            @Override
            public boolean check() {
                return oblong.getLength() != oblong.getLength();
            }
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
