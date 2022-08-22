package Chapter15;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

    public static void main(String[] args) {
        Set<String> regNum = new HashSet<>();
        regNum.add("V53PLS");
        regNum.add("W79TRV");
        regNum.add("X85ADZ");
        regNum.add("L22SBG");
        System.out.println(regNum);
        System.out.println("Number of items in set: "+regNum.size());
        boolean okAdd = regNum.add("X85ADZ");
        System.out.println("Adding X85ADZ....");
        if(!okAdd){
            System.out.println("item already in the set!");
        }else {
            System.out.println(regNum);
        }
        regNum.remove("V53PLS");
        System.out.println("Removing X85ADZ....");
        System.out.println(regNum);
        boolean okRemove = regNum.remove("V53PLS");
        System.out.println("Removing X85ADZ....");
        if(!okRemove){
            System.out.println("item is not in the set!");
        }else {
            System.out.println(regNum);
        }
        boolean okContains = regNum.contains("L22SBG");
        if(!okContains){
            System.out.println("We dont have L22SBG in our set!");
        }else {
            System.out.println("We have L22SBG in our set!");
        }
        boolean okEmpty = regNum.isEmpty();
        if(!okEmpty){
            System.out.println("Set is not empty!");
        }else {
            System.out.println("Set it empty");
        }

    }

}
