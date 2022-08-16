package Chapter14;

import java.util.Optional;

public class Temp {
    public static void main(String[] args) {
        Optional<String> grade = Optional.of("B+");
        String op1 = "not null";
        String op2 = null;
        System.out.println("Non-Empty Optional1: "+grade);
        System.out.println("Value of Non-empty Optional1: "+grade.get());
        System.out.println("Empty Optional1: "+Optional.empty());


    }
}
