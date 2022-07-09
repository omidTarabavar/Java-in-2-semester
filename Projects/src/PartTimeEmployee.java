public class PartTimeEmployee extends Employee{
    private double hourlyPay;
    public PartTimeEmployee(String numberIn,String nameIn,double hourlyPayIn){
        super(numberIn,nameIn);
        hourlyPay = hourlyPayIn;
    }

    public void setHourlyPay(double hourlyPayIn) {
        hourlyPay = hourlyPayIn;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }
    public double calculateWeeklyPay(int noOfHoursIn){
        return noOfHoursIn * hourlyPay;
    }
    @Override
    public String getStatus(){
        return "Part-Time";
    }

}
