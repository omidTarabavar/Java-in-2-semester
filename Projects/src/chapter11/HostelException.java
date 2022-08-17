package chapter11;

public class HostelException extends RuntimeException{
    HostelException(){
        super("HostelException occurred");
    }
    HostelException(String message){
        super(message);
    }
}
