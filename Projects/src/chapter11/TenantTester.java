package chapter11;

public class TenantTester {
    public static void main(String[] args) {
        Tenant t1 = new Tenant("John",200);
        Payment p1 = new Payment("July",550);
        t1.makePayment(p1);
        System.out.println(t1);
    }
}
