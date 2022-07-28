package Chapter13;

public class LambdaSyntaxDemo4 {
    public static void main(String[] args) {
        testMethod((x,y) -> System.out.println("The sum is "+(x+y)));
    }
    static void testMethod(TestInterface3 testObject){
        testObject.test(10,5);
    }
}
