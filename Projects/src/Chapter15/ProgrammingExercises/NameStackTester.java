package Chapter15.ProgrammingExercises;

public class NameStackTester {
    public static void main(String[] args) {
        NameStack nameStack = new NameStack();
        nameStack.push("Omid");
        nameStack.push("Mohammad");
        System.out.println("There is "+nameStack.size()+" items in nameStack");
        System.out.println(nameStack.isEmpty() ? "NameStack is empty":"NameStack is not empty");
        System.out.println(nameStack);
        try {
            System.out.println(nameStack.pop()+" removed");
            System.out.println(nameStack.pop()+" removed");
        }catch (NameStackException e){
            System.out.println(e);
        }
        System.out.println("There is "+nameStack.size()+" items in nameStack");
        System.out.println(nameStack.isEmpty() ? "NameStack is empty":"NameStack is not empty");
        System.out.println(nameStack);
    }
}
