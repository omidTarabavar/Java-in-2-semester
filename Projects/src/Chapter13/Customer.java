package Chapter13;

public class Customer {
    private String customerId;
    private String name;
    private double creditLimit;
    public Customer(String id,String name,double creditLimit){
        customerId = id;
        this.name = name;
        this.creditLimit = creditLimit;
    }
    public String getCustomerId(){
        return customerId;
    }
    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public void setCreditLimit(double limit){
        creditLimit = limit;
    }
}
