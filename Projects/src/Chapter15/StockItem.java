package Chapter15;

import java.util.Objects;

public class StockItem {
    final String stockNumber;
    final String name;
    double price;
    int totalStock=0;
    static double salesTax ;
    public StockItem(String stockNumberIn,String nameIn,double priceIn){
        stockNumber = stockNumberIn;
        name = nameIn;
        price = priceIn;
    }
    public String getStockNumber(){
        return stockNumber;
    }
    public String getName(){
        return name;
    }
    public int getTotalStock(){
        return totalStock;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double priceIn){
        price = priceIn;
    }
    public double calculateTotalPrice(){
        return price * totalStock;
    }
    public void increaseTotalStock(int addIn){
        totalStock += addIn;
    }
    static void setSalesTax(double saleTaxIn){
        salesTax = saleTaxIn;
    }

    @Override
    public String toString() {
        return "( "+stockNumber+", "+name+", "+price+" )";
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        StockItem stockItem = (StockItem) obj;
        return stockNumber.equals(stockItem.stockNumber);
    }

    @Override
    public int hashCode() {
        return stockNumber.hashCode();
    }
}
