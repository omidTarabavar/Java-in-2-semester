package Chapter15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratingThroughSet {
    public static void main(String[] args) {
        Set<String> regNum = new HashSet<>();
        regNum.add("V53PLS");
        regNum.add("W79TRV");
        regNum.add("X85ADZ");
        regNum.add("L22SBG");
        System.out.println("Using enhanced for loop: ");
        for(String item:regNum){
            if(item.charAt(0) > 'T'){
                System.out.println(item);
            }
        }
        System.out.println("\nUsing foreach: ");
        regNum.forEach(item -> {
            if(item.charAt(0) > 'T'){
                System.out.println(item);
            }
        });
    }
}
