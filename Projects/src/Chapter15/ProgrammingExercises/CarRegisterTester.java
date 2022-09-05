package Chapter15.ProgrammingExercises;

public class CarRegisterTester {
    public static void main(String[] args) {
        CarRegister carRegister = null;
        try {
            carRegister = new CarRegister(-2);
        } catch (CarRegisterException e) {
            System.out.println(e);
        }
        if(carRegister == null){
            try {
                carRegister = new CarRegister(5);
            }catch (CarRegisterException e){
                System.out.println(e);
            }
        }
        System.out.println("Permission to 001 "+(carRegister.givePermit("001") ? "granted":"not granted, it has permission already"));
        System.out.println("Permission to 001 "+(carRegister.givePermit("001") ? "granted":"not granted, it has permission already"));
        System.out.println("Permission to 002 "+(carRegister.givePermit("002") ? "granted":"not granted, it has permission already"));
        System.out.println(carRegister.recordParking("001")?"001 entered the parking":"001 cannot enter the parking");
        System.out.println(carRegister.recordParking("005")?"005 entered the parking":"005 cannot enter the parking");
        System.out.println(carRegister.recordExit("001")? "001 exited":"there is no 001");
        System.out.println(carRegister.recordExit("001")? "001 exited":"there is no 001");
        System.out.println(carRegister.isParked("002")? "002 is parked":"002 is not parked");
        System.out.println("parking is "+(carRegister.isFull()?"full":"not full"));
        System.out.println("number of parked: "+carRegister.numberParked());
        System.out.println("Permitted cars: "+carRegister.getPermit());
        System.out.println("Parked cars: "+carRegister.getParked());
        System.out.println("Capacity of parking is: "+carRegister.getCapacity());

    }
}
