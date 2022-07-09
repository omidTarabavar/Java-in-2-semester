import java.util.Scanner;

public class EmployeeTester {
    public static void main(String[] args) {

        FullTimeEmployee fte = new FullTimeEmployee("A1","FullTime Omid",100000);
        PartTimeEmployee pte = new PartTimeEmployee("A2","PartTime Mohammad",200);
        testMethod(fte);
        testMethod(pte);
    }
    static void testMethod(Employee employeeIn){
        System.out.println("Name of Employee: "+employeeIn.getName());
        System.out.println("Number of Employee: "+employeeIn.getNumber());

    }
}
