package Chapter13;

public class LambdaSyntaxDemo1 {
    public static void main(String[] args) {
        testMethod(() -> System.out.println("Hello"));
    }
    static void testMethod(TestInterface1 testObject){
        testObject.test();
    }
}
