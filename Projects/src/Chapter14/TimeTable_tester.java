package Chapter14;

import java.util.Scanner;

public class TimeTable_tester {
    private static Booking makeBook(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter room number: ");
        String roomNum = keyboard.nextLine();
        System.out.print("Enter lecture name: ");
        String lectureName = keyboard.nextLine();
        Booking book = new Booking(roomNum,lectureName);
        return book;
    }
    private static int[] getInput(){
        Scanner keyboard = new Scanner(System.in);
        int[] inputs = new int[2];
        System.out.print("Enter the day: ");
        inputs[0] = keyboard.nextInt()-1;
        System.out.print("Enter the period: ");
        inputs[1] = keyboard.nextInt()-1;
        return inputs;
    }
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        char ans;
        System.out.print("Number of days: ");
        int days = keyboard.nextInt();
        System.out.print("Number of periods: ");
        int periods = keyboard.nextInt();
        TimeTable table = new TimeTable(days,periods);
        do{
            System.out.println();
            System.out.println("1-Make booking");
            System.out.println("2-Cancel booking");
            System.out.println("3-Free checker");
            System.out.println("4-Get booking");
            System.out.println("5-Get number of days");
            System.out.println("6-Get number of periods");
            System.out.println("7-Exit");
            System.out.print("-> ");
            ans = keyboard.next().charAt(0);
            switch (ans){
                case '1': {
                    try {
                        Booking myBooking = makeBook();
                        int[] inputs = getInput();
                        table.makeBooking(inputs[0], inputs[1], myBooking);
                        System.out.println("Done");
                    } catch (TimeTableException e) {
                        System.out.println(e);
                    }
                    break;
                }
                case '2':{
                    try {
                        int[] inputs = getInput();
                        table.cancelBooking(inputs[0],inputs[1]);
                        System.out.println("Done!");
                    }
                    catch (TimeTableException e){
                        System.out.println(e);
                    }
                    break;
                }
                case '3':{
                    int[] inputs = getInput();
                    boolean ok = table.isFree(inputs[0],inputs[1]);
                    if (ok){
                        System.out.println("Its is free!");
                    }
                    else {
                        System.out.println("Already booked!");
                    }
                    break;
                }
                case '4':{
                    int[] inputs = getInput();
                    if(table.getBooking(inputs[0],inputs[1]).isPresent()){
                        System.out.println("Room number: "+table.getBooking(inputs[0],inputs[1]).get().getRoom()+"\nLecture name: "+table.getBooking(inputs[0],inputs[1]).get().getName());
                    }else {
                        System.out.println("There is no reservation with this information!");

                    }
                    break;
                }
                case '5':{
                    System.out.println("Number of days: "+table.numberOfDays());
                    break;
                }
                case '6':{
                    System.out.println("Number of periods: "+table.numberOfPeriods());
                    break;
                }
                case '7':{
                    break;
                }
                default:{
                    System.out.println("Enter a valid number!");
                }
            }
        }while (ans != '7');


    }

}
