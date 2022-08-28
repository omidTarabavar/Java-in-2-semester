package Chapter15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSortDemo {
    public static void main(String[] args) {
        String[] cityArrays = {"London","Birmingham","Manchester","Liverpool"};
        System.out.println("Original Array "+ Arrays.toString(cityArrays));
        List<String> cityList = Arrays.asList(cityArrays);
        System.out.println("Original List "+cityList);
        Arrays.sort(cityArrays);
        Collections.sort(cityList);
        System.out.println("Sorted Array "+Arrays.toString(cityArrays));
        System.out.println("Sorted List "+cityList);
    }
}
