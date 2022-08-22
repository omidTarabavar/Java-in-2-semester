package Chapter15;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<String> printQ = new ArrayList<>();
        printQ.add("importantMemo.doc");
        printQ.add("myLetter.doc");
        printQ.add("results.xls");
        printQ.add("newChapter.doc");
        printQ.forEach(item -> {
            if(item.endsWith(".doc")){
                System.out.println(item);
            }
        });
    }
}
