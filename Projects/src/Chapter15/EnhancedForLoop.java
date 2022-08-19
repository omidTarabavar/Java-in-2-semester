package Chapter15;

import java.util.ArrayList;
import java.util.List;

public class EnhancedForLoop {
    public static void main(String[] args) {
        List<String> printQ = new ArrayList<>();
        printQ.add("importantMemo.doc");
        printQ.add("myLetter.doc");
        printQ.add("results.xls");
        printQ.add("newChapter.doc");
        for(String item:printQ){
            if(item.endsWith(".doc")){
                System.out.println(item);
            }
        }
        System.out.println();
        for(int pos = 1 ; pos < printQ.size();pos++){
            System.out.println(printQ.get(pos));
        }

    }
}
