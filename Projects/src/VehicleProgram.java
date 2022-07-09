import java.util.ArrayList;
import java.util.Date;

public class VehicleProgram {
    public static void main(String[] args) {
        ArrayList<Vehicle> myVehicles = new ArrayList<>();
        char ans;
        do{
            showMenu();
            ans= EasyScanner.nextChar();
            switch (ans){
                case '1':{
                    myVehicles.add(addVehicle());
                    break;
                }
                case '2':{
                    displayListOfVehicleDetails(myVehicles);
                    break;
                }
                case '3':{
                    deleteAVehicle(myVehicles);
                    break;
                }
                case '4':{
                    System.out.println("Ok, Have a nice day!");
                    break;
                }
                default:{
                    System.out.println("Enter a valid number!");
                }
            }
        }while (ans != '4');
    }
    public static void showMenu(){
        System.out.println();
        System.out.println("1- Add a vehicle");
        System.out.println("2- Display a list of vehicle details");
        System.out.println("3- Delete a vehicle");
        System.out.println("4- Quit");
        System.out.print("\n-> ");
    }

    public static Vehicle addVehicle(){
        System.out.print("Enter registry number: ");
        String regNo = EasyScanner.nextString();
        System.out.print("Enter make: ");
        String make = EasyScanner.nextString();
        System.out.print("Enter year of manufacture: ");
        int yearOfManufacture = EasyScanner.nextInt();
        System.out.print("Enter Value: ");
        double value = EasyScanner.nextDouble();
        Vehicle myVehicle = new Vehicle(regNo,make,yearOfManufacture,value);
        return myVehicle;
    }
    public static int getCurrentTime(){
        Date nowDate = new Date();
        String nowString = nowDate.toString();
        int year = 0;
        for(int i=nowString.length()-4;i<nowString.length();i++){
            year = year * 10 + (nowString.charAt(i)-'0');
        }
        return year;
    }
    public static void displayListOfVehicleDetails(ArrayList<Vehicle> myVehicles){
        if(myVehicles.size() != 0) {
            for (Vehicle item : myVehicles) {
                System.out.println("\nRegistry Number: " + item.getRegNo());
                System.out.println("Make: " + item.getMake());
                System.out.println("Year of Manufacture: " + item.getYearOfManufacture());
                System.out.println("Value: " + item.getValue());
                System.out.println("Age: " + item.calculateAge(getCurrentTime()));
                System.out.println();
            }
        }else {
            System.out.println("There is no vehicle!");
        }
    }
    public static void deleteAVehicle(ArrayList<Vehicle> myVehicles){
        System.out.print("Enter Registry number: ");
        String regNo = EasyScanner.nextString();
        int index;
        boolean flag = false;
        for(int i =0;i<myVehicles.size();i++){
            if(myVehicles.get(i).getRegNo().equals(regNo) ){
                myVehicles.remove(i);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("There is no Vehicle with that registry number!");
        }

    }
}
