package Chapter15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SelfTestQuestions5 {
    public static void main(String[] args) {
        Set<String> regNum = new HashSet<>();
        regNum.add("V53PLS");
        regNum.add("W79TRV");
        regNum.add("X85ADZ");
        regNum.add("L22SBG");
        System.out.println("Using enhanced for loop: ");
        for(String strings:regNum){
            if(strings.endsWith("S")){
                System.out.println(strings);
            }
        }
        System.out.println("\nUsing foreach:");
        regNum.forEach(string -> {
            if(string.endsWith("S")) System.out.println(string);
        });
        System.out.println("\nUsing Iterator to remove items:");
        System.out.println("Before removing: "+regNum);
        Iterator<String> elemets = regNum.iterator();
        elemets.forEachRemaining(item ->{
            if(item.endsWith("S")) elemets.remove();
        });
        System.out.println("After removing: "+regNum);
    }
}
