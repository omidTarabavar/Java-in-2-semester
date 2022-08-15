package Chapter14;

public class HostelException extends RuntimeException{
    public HostelException(){
        super("error in Hostel application");
    }
    public HostelException(String message){
        super(message);
    }
}
