package Chapter15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Temp {

    public static void main(String[] args) {
        Set<Integer> ourSet =new HashSet<>();
        ourSet.add(1);
        ourSet.add(2);
        ourSet.add(3);
        ourSet.add(4);

        ArrayList<Set<Integer>> ourArray =new ArrayList<>();
        ourArray.add(ourSet);
        System.out.println(ourArray);
        for(Set<Integer> ourset:ourArray){
            for(Integer integer:ourset){
                System.out.println(integer);
            }
        }

    }

}
