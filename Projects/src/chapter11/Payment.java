package chapter11;

/** Class used to store details of a single payment in a hostel
 * @author omidTarabavar
 * @version 1.0
 */
public class Payment {

    private String month;
    private double amount;

    /** Constructor initialises the payment month and the amount paid
     * @param month : month of payment
     * @param amount : amount of payment
     */
    public Payment(String month,double amount){
        this.month = month;
        this.amount = amount;
    }

    /** Reads the month for which payment was made
     * @return Returns the month for which payment was made
     */
    public String getMonth() {
        return month;
    }

    /** Reads the amount paid
     * @return Returns the amount paid
     */
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "(" + month +", "+amount+")";
    }
}
