package Chapter13;

public class LambdaSyntaxDemo3 {
    public static void main(String[] args) {
        testMethod(str -> str = "Hello "+str);
    }
    static void testMethod(TestInterface2 testObject){
        String output = testObject.test("world");
        System.out.println(output);
    }
}
