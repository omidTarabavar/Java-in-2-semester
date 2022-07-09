import java.util.Scanner;

public class ApartmentTester {

    public static void main(String[] args){
        Apartment myApartment = new Apartment();
        char ans;
        int roomNum;
        int numOfRooms=0;
        do {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("\n1-Add a room");
            System.out.println("2-Get room area");
            System.out.println("3-Get room length");
            System.out.println("4-Get room height");
            System.out.println("5-Exit");
            System.out.println();
            System.out.print("-> ");
            ans = keyboard.next().charAt(0);
            switch (ans){
                case '1':{
                    System.out.print("Enter Length: ");
                    double length = keyboard.nextDouble();
                    System.out.print("Enter Height: ");
                    double height = keyboard.nextDouble();
                    Oblong room = new Oblong(length,height);
                    myApartment.add(room);
                    numOfRooms += 1;
                    System.out.println("\nRoom number: "+numOfRooms+" with lenght: "+length+" and height: "+height+" added!");
                    break;
                }
                case '2':{
                    System.out.print("Enter room number: ");
                    roomNum = keyboard.nextInt();
                    double area =myApartment.getRoomArea(roomNum);
                    System.out.println("Area of room "+roomNum+": "+area);
                    break;
                }
                case '3':{
                    System.out.print("Enter room number: ");
                    roomNum = keyboard.nextInt();
                    double Length =myApartment.getRoomLength(roomNum);
                    System.out.println("Length of room "+roomNum+": "+Length);
                    break;
                }
                case '4':{
                    System.out.print("Enter room number: ");
                    roomNum = keyboard.nextInt();
                    double Height =myApartment.getRoomHeight(roomNum);
                    System.out.println("Height of room "+roomNum+": "+Height);
                    break;
                }
                case '5':{
                    break;
                }
                default:{
                    System.out.println("Enter a valid number!");
                }
            }
        }while (ans != '5');
    }
}
