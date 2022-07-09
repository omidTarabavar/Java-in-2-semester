public class GoldAccount extends BankAccount {
    private double overdraftLimit;

    public GoldAccount(String accountNumberIn,String accountNameIn,double limitIn){
        super(accountNumberIn,accountNameIn);
        overdraftLimit = limitIn;
    }
    public void setLimit(double limitIn){
        overdraftLimit = limitIn;
    }
    public double getLimit(){
        return overdraftLimit;
    }
    @Override
    public boolean withdraw(double amountIn){
        if(amountIn > balance + overdraftLimit){
            return false;
        }
        else {
            balance -= amountIn;
            return true;
        }
    }


}
