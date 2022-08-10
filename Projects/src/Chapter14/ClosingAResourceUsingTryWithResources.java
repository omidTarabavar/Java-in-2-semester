package Chapter14;

import java.util.Scanner;

public class ClosingAResourceUsingTryWithResources {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){
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
        System.out.println("Goodbye");
    }

}
