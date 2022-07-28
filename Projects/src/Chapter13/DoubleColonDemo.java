package Chapter13;

public class DoubleColonDemo {
    public static void main(String[] args) {
        testMethod(System.out::println);
    }
    static void testMethod(DoubleColonInterface1 testObject){
        testObject.test("Hello world");
    }
}
