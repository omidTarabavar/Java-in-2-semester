public class SecHandVehTester {
    public static void main(String[] args) {
        System.out.print("Enter registry number: ");
        String regNum = EasyScanner.nextString();
        System.out.print("Enter make: ");
        String make = EasyScanner.nextString();
        System.out.print("Enter year of manufacture: ");
        int yearOfManufacture = EasyScanner.nextInt();
        System.out.print("Enter value: ");
        double value = EasyScanner.nextDouble();
        System.out.print("Enter number of owners: ");
        int numOfOwners = EasyScanner.nextInt();
        SecondHandVehicle myVehicle = new SecondHandVehicle(regNum,make,yearOfManufacture,value,numOfOwners);
        System.out.println("Reg num: "+myVehicle.getRegNo());
        System.out.println("Make: "+myVehicle.getMake());
        System.out.println("Year of Manufacture: "+myVehicle.getYearOfManufacture());
        System.out.println("Value: "+myVehicle.getValue());
        System.out.println("Has Multiple owners: "+myVehicle.hasMultipleOwners());
        if(myVehicle.getNumberOfOwners() > 1){
            System.out.println("Number of owners: "+myVehicle.getNumberOfOwners());
        }
    }
}
