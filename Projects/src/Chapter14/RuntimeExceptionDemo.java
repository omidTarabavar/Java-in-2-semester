package Chapter14;

import java.util.Scanner;

public class RuntimeExceptionDemo {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Enter size of list: ");
            int size = keyboard.nextInt();
            PaymentList p = new PaymentList(size);
        }catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println("END OF DEMO");
    }
}
