package Chapter14;

public class InvalidPositionException extends RuntimeException{
    public InvalidPositionException(){
        super("Invalid position Exception occurred");
    }
    public InvalidPositionException(String message){
        super(message);
    }
}
