package chapter11;

import java.util.Scanner;

public class TenantListTester {
    static Scanner keyboard =new Scanner(System.in);
    public static void main(String[] args) {
        char choice;
        int size;
        System.out.print("Size of list? ");
        size = keyboard.nextInt();
        TenantList list = new TenantList(size);
        do{
            System.out.println();
            System.out.println("[1] ADD TENANT");
            System.out.println("[2] REMOVE TENANT");
            System.out.println("[3] DISPLAY TENANTS");
            System.out.println("[4] SEARCH");
            System.out.println("[5] GET TENANT");
            System.out.println("[6] IS EMPTY");
            System.out.println("[7] IS FULL");
            System.out.println("[8] GET TOTAL");
            System.out.println("[9] QUIT");
            System.out.println();
            System.out.print("Enter a choice [1-9]: ");
            choice = keyboard.next().charAt(0);
            System.out.println();

            switch (choice){
                case '1':option1(list); break;
                case '2':option2(list); break;
                case '3':option3(list); break;
                case '4':option4(list); break;
                case '5':option5(list); break;
                case '6':option6(list); break;
                case '7':option7(list); break;
                case '8':option8(list); break;
                case '9': System.out.println("TESTING COMPLETE"); break;
                default: System.out.println("1-9 only");
            }
        }while (choice != '9');
    }
    static void option1(TenantList list){
        System.out.print("Enter Name: ");
        String name = keyboard.next();
        System.out.print("Enter Room: ");
        int room = keyboard.nextInt();
        Tenant tenant = new Tenant(name,room);
        boolean ok = list.addTenant(tenant);
        if(!ok){
            System.out.println("ERROR: List is full");
        }
    }
    static void option2(TenantList list){
        System.out.print("Enter Room: ");
        int room = keyboard.nextInt();
        try {
            list.removeTenant(room);
        }
        catch (HostelException e){
            System.out.println(e);
        }
    }
    static void option3(TenantList list){
        System.out.println("ITEMS ENTERED");
        System.out.println(list);
    }
    static void option4(TenantList list){
        System.out.print("Enter Room: ");
        int room = keyboard.nextInt();
        try {
            System.out.println(list.search(room).get());
        }
        catch (HostelException e){
            System.out.println(e);
        }
    }
    static void option5(TenantList list){
        System.out.print("Enter tenant number to retrieve: ");
        int num = keyboard.nextInt();
        if(list.getTenant(num).isPresent()){
            System.out.println(list.getTenant(num).get());
        }else {
            System.out.println("INVALID TENANT NUMBER");
        }
    }
    static void option6(TenantList list){
        if(list.isEmpty()){
            System.out.println("List is empty");
        }else {
            System.out.println("List is not empty");
        }
    }
    static void option7(TenantList list){
        if(list.isFull()){
            System.out.println("List is full");
        }else {
            System.out.println("List is not full");
        }
    }
    static void option8(TenantList list){
        System.out.print("TOTAL NUMBER OF TENANTS ENTERED: ");
        System.out.println(list.getTotal());
    }
}
