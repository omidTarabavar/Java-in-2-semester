package Chapter15.ProgrammingExercises;

public class CarRegisterException extends Exception {
    public CarRegisterException(){
        super("Can't use a negative number for parking capacity");
    }
}
