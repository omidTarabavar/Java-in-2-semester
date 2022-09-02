package Chapter15;

import java.util.HashSet;
import java.util.Set;

public class ProgrammingExcercise2 {
    public static void main(String[] args) {
        Set<StockItem> stockItemSet = new HashSet<>();
        stockItemSet.add(new StockItem("001","Omid",200));
        stockItemSet.add(new StockItem("002","Mohammad",220));
        stockItemSet.add(new StockItem("003","Ali",300));
        stockItemSet.add(new StockItem("004","Hossein",400));
        stockItemSet.add(new StockItem("005","Mahdi",100));
        System.out.println(stockItemSet);
        System.out.println(stockItemSet.contains(new StockItem("003","Ali",300))?"it contains 003":"it doesn't contain 003");

    }
}
