package Chapter15.OurExperiment;

import java.util.*;

public class Customer implements Comparable<Customer>{
    int priority;
    int customerNumber;
    public Customer(int customerNumber,int priority){
        this.priority = priority;
        this.customerNumber = customerNumber;
    }


    @Override
    public String toString() {
        return "(Customer Number: "+customerNumber+", Priority: "+priority+")";
    }

    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1,0));
        customerList.add(new Customer(2,0));
        customerList.add(new Customer(3,1));
        customerList.add(new Customer(4,0));
        customerList.add(new Customer(5,0));
        System.out.println("Before sort: "+customerList);
        customerList.sort(Customer::compareTo);
        System.out.println("After sort: "+customerList);

    }

    @Override
    public int compareTo(Customer obj) {
        int comparison = Integer.compare(priority,obj.priority)*(-1);
        if(comparison == 0){
            comparison = Integer.compare(customerNumber, obj.customerNumber);
        }
        return comparison;
    }
}
