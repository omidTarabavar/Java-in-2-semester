package Chapter15.ProgrammingExercises3;

import java.util.ArrayList;
import java.util.List;

public class NameStack {
    private List<String> stack;
    public NameStack(){
        stack = new ArrayList<>();
    }
    public void push(String name){
        stack.add(name);
    }
    public String pop() throws NameStackException {
        if(stack.isEmpty()){
            throw new NameStackException();
        }
        return stack.remove(stack.size()-1);
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public String toString(){
        return stack.toString();
    }
}
