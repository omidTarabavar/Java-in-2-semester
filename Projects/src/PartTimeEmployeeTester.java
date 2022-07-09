import java.util.Scanner;

public class PartTimeEmployeeTester {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardString = new Scanner(System.in);
        String number,name;
        double hourlyPay;
        int noOfHours;
        PartTimeEmployee emp;
        System.out.print("Employee number: ");
        number = keyboardString.nextLine();
        System.out.print("Employee name: ");
        name = keyboardString.nextLine();
        System.out.print("Hourly pay: ");
        hourlyPay = keyboard.nextDouble();
        System.out.print("Hours worked this week: ");
        noOfHours = keyboard.nextInt();
        emp = new PartTimeEmployee(number,name,hourlyPay);
        System.out.println();
        System.out.println("Employee name: "+emp.getName());
        System.out.println("Employee number: "+emp.getNumber());
        System.out.print("Weekly pay: "+emp.calculateWeeklyPay(noOfHours));

    }
}
