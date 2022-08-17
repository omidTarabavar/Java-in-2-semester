package chapter11;

import java.util.Scanner;

public class PaymentListTester {
    static Scanner keyBoard = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        int size;
        PaymentList list;
        System.out.print("Size of list? ");
        size = keyBoard.nextInt();
        list = new PaymentList(size);
        do {
            System.out.println();
            System.out.println("[1] ADD PAYMENT");
            System.out.println("[2] DISPLAY PAYMENTS");
            System.out.println("[3] IS FULL");
            System.out.println("[4] GET PAYMENT");
            System.out.println("[5] GET TOTAL");
            System.out.println("[6] CALCULATE TOTAL PAID");
            System.out.println("[7] Quit");
            System.out.println();
            System.out.print("Enter a choice [1-7]: ");

            choice = keyBoard.next().charAt(0);
            System.out.println();

            switch (choice){
                case '1':option1(list); break;
                case '2':option2(list); break;
                case '3':option3(list); break;
                case '4':option4(list); break;
                case '5':option5(list); break;
                case '6':option6(list); break;
                case '7': System.out.println("TESTING COMPLETE"); break;
                default: System.out.println("1-7 only");
            }
        }while (choice != '7');
    }

    static void option1(PaymentList list){
        System.out.print("Enter Month: ");
        String month = keyBoard.next();
        System.out.print("Enter Amount: ");
        double amount = keyBoard.nextDouble();
        Payment p = new Payment(month,amount);
        try {
            list.addPayment(p);
            System.out.println("Done");
        }
        catch (HostelException e){
            System.out.println("ERROR: List is full");
        }
    }
    static void option2(PaymentList list){
        System.out.println("ITEMS ENTERED");
        System.out.println(list);
    }
    static void option3(PaymentList list){
        if(list.isFull()){
            System.out.println("list is full");
        }else {
            System.out.println("list is not full");
        }
    }
    static void option4(PaymentList list){
        System.out.print("Enter payment number to retrieve: ");
        int num = keyBoard.nextInt();
        if(list.getPayment(num).isPresent()){
            System.out.println(list.getPayment(num).get());
        }else {
            System.out.println("INVALID PAYMENT NUMBER");
        }
    }
    static void option5(PaymentList list){
        System.out.print("TOTAL NUMBER OF PAYMENTS ENTERED: ");
        System.out.println(list.getTotal());
    }
    static void option6(PaymentList list){
        System.out.print("TOTAL OF PAYMENTS MADE SO FAR: ");
        System.out.println(list.calculateTotalPaid());
    }
}
