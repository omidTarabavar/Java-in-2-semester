package Chapter14;

import java.util.Scanner;

public class HostelExceptionDemo {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Enter size of list: ");
            int size = keyboard.nextInt();
            PaymentList p = new PaymentList(size);
        }
        catch (HostelException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some unforseen error");
            e.printStackTrace();
        }
        System.out.println("END OF DEMO");
    }
}
