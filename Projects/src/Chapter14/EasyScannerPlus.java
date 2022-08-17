package Chapter14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EasyScannerPlus {
    public static int nextInt(){
        while (true) {
            try {
                Scanner keyboard = new Scanner(System.in);
                return keyboard.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input!\nEnter again: ");
            }
        }
    }
    public static double nextDouble(){
        while (true){
            try {
                Scanner keyboard = new Scanner(System.in);
                return keyboard.nextDouble();
            }
            catch (InputMismatchException e){
                System.out.print("Invalid input!\nEnter again: ");
            }
        }

    }
}
