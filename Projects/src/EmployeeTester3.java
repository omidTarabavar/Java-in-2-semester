public class EmployeeTester3 {
    public static void main(String[] args) {
        Employee emp;
        char choise;
        String numberEntered,nameEntered;
        double salaryEntered,payEntered;
        System.out.println("Choose (F)ull-Time or (P)art-Time Emploee: ");
        choise = EasyScanner.nextChar();
        System.out.print("Enter employee number: ");
        numberEntered = EasyScanner.nextString();
        System.out.print("Enter employee name: ");
        nameEntered = EasyScanner.nextString();
        if(choise == 'F' || choise == 'f'){
            System.out.print("Enter annual salary: ");
            salaryEntered = EasyScanner.nextDouble();
            emp = new FullTimeEmployee(numberEntered,nameEntered,salaryEntered);
        }
        else {
            System.out.print("Enter hourly pay: ");
            payEntered = EasyScanner.nextDouble();
            emp = new PartTimeEmployee(numberEntered,nameEntered,payEntered);
        }
        testMethod(emp);

    }
    static void testMethod(Employee employeeIn){
        System.out.println(employeeIn.getStatus());
    }
}
