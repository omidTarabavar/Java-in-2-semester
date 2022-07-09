import java.util.Scanner;

public class ExtendedOblongTester {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter length of Oblong: ");
        double length = keyboard.nextDouble();
        System.out.print("Enter height of Oblong: ");
        double height = keyboard.nextDouble();
        System.out.print("Enter symbol of oblong: ");
        char symbol = keyboard.next().charAt(0);
        ExtendedOblong myOblong = new ExtendedOblong(length,height,symbol);
        System.out.println(myOblong.draw());
        System.out.println();
        System.out.print("Enter another symbol: ");
        myOblong.setSymbol(keyboard.next().charAt(0));
        System.out.println(myOblong.draw());

    }
}
