package Chapter14;

public class TimeTableException extends RuntimeException{
    TimeTableException(){
        super("Invalid input, TimeTableException occurred");
    }
    TimeTableException(String message){
        super(message);
    }
}
