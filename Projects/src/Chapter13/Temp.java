package Chapter13;

public class Temp {
    public static void main(String[] args) {
        testMethod(Temp::sumOfNumbers); // ((x,y,z) -> sumOfNumbers(x,y,z)
    }
    static void testMethod(TempInterface tempInterface){
        System.out.println(tempInterface.powTest(2,3,4));
    }
    static int sumOfNumbers(int a,int b,int c){
        return a+b+c;
    }
}
