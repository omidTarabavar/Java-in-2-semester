package Chapter13;

public class DoubleColonDemo2 {
    public static void main(String[] args) {
        testMethod(Math::sqrt);
    }
    static void testMethod(DoubleColonInterface2 testObject){
        System.out.println(testObject.test(25));
    }
}
