package chapter11;

public class PaymentTester {
    public static void main(String[] args) {
        Payment p1 = new Payment("January",175);
        Payment p2 = new Payment("May",180);

        PaymentList p5 = new PaymentList(4);
        p5.addPayment(p1);
        p5.addPayment(p2);
        System.out.println(p5.toString());
    }
}
