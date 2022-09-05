package Chapter15.ProgrammingExercises;

public class NameStackException extends Exception{
    public NameStackException(){ super("can't pop an item from an empty stack");}
    public NameStackException(String message){ super(message);}
}
