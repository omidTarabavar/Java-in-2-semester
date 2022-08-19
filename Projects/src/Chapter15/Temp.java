package Chapter15;

import java.util.ArrayList;
import java.util.List;

public class Temp {

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("Hello");
        a.add("Bye");
        String b = a.remove(1);
        Boolean c = a.remove("Hello");
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
    }
    void remove(int a){

    }
    void remove(int a,int b){

    }
}
