package Chapter14;

import java.util.Scanner;

public class ClosingAResourceUsingFinally {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            String[] colors = {"RED","BLUE","GREEN"};
            System.out.print("Which color? {1,2,3}: ");
            String pos = keyboard.next();
            int i = Integer.parseInt(pos);
            System.out.println(colors[i-1]);
            System.out.println("END TRY");

        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("ENTER CATCH");
            System.out.println(arrayIndexOutOfBoundsException);
        }
        finally {
            System.out.println("ENTER FINALLY");
            keyboard.close();
            System.out.println("Scanner CLOSED");
        }
        System.out.println("Goodbye");
    }

}
