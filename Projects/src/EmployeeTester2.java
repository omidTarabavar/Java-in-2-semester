public class EmployeeTester2 {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("A1","Ms Full-Time",20000);
        PartTimeEmployee pte = new PartTimeEmployee("A2","Mr Part-Time",25000);
        testMethod(fte);
        testMethod(pte);
    }
    static void testMethod(Employee employeeIn){
        System.out.println(employeeIn.getStatus());
    }
}
