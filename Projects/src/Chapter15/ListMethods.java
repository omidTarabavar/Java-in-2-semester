package Chapter15;

import Chapter13.Oblong;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> printQ = new ArrayList<>();
        printQ.add("myLetter.doc");
        printQ.add("myFoto.jpg");
        printQ.add("results.xls");
        printQ.add("chapter.doc");
//        printQ.add(new Oblong(10,20)); -> result in compiler error
        System.out.println(printQ);
        printQ.add(0,"importantMemo.doc");
        System.out.println(printQ);
        printQ.set(4,"newChapter.doc");
        System.out.println(printQ);
        printQ.set(printQ.size()-1,"newNewChapter.doc");
        System.out.println(printQ);
        int index = printQ.indexOf("myFoto.jpg");
        if(index != -1){
            System.out.println("myFoto.jpg is at index position: "+index);
        }else {
            System.out.println("myFoto.jpg not in list");
        }
        printQ.remove(1);
        System.out.println(printQ);
        printQ.remove("myFoto.jpg");
        System.out.println(printQ);
        System.out.println("First job is "+printQ.get(0));
        if(printQ.contains("poem.doc")){
            System.out.println("poem.doc is in the list");
        }else {
            System.out.println("poem.doc is not in the list");
        }
        if(printQ.isEmpty()){
            System.out.println("Print queue is empty");
        }else {
            System.out.println("Print queue is not empty");
        }
    }
    public void someMethod(List<String> printQ){

    }
}
