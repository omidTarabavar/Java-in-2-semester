package Chapter13;

public class LambdaSyntaxDemo2 {
    public static void main(String[] args) {
        testMethod(() -> {
            System.out.println("Hello ");
            System.out.println("world");
        });
    }
    static void testMethod(TestInterface1 testObject){
        testObject.test();
    }
}
