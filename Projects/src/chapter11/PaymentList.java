package chapter11;

import java.util.ArrayList;
import java.util.Optional;

/** Collection class to hold a list of Payment objects
 * @author omidTarabavar
 * @version 1.0
 */
public class PaymentList {
    // attributes
    private ArrayList<Payment> pList;
    public final int MAX;

    /** Constructor initialises the empty payment list and sets the maximum list size
     * @param MAX : The maximum number of payments in the list
     */
    public PaymentList(int MAX){
        pList = new ArrayList<>();
        this.MAX = MAX;
    }

    /** Adds a new payment to the end of the list
     * @param payment : The payment to add
     * @return Returns true if the object was added successfully and false otherwise
     */
    public void addPayment(Payment payment){
        if(isFull()){
            throw new HostelException("List is full");
        }
        pList.add(payment);

    }

    /** Checks if the payment list is full
     * @return Returns true if the list is full and false otherwise
     */
    public boolean isFull(){
        return pList.size() == MAX;
    }

    /** Gets the total number of payments
     * @return Returns the total number of payments currently in the list
     */
    public int getTotal(){
        return pList.size();
    }

    /** Reads the payment at the  given position in the list
     * @param position: The logical position of the payment in the list
     * @return Returns the payment at the given logical position in the list or null if no payment at that logical position
     */
    public Optional<Payment> getPayment(int position){
        if(position < 1 || position > getTotal()){
            // no objects found at given position
            return Optional.empty();
        }else {
            // take one off logical position to get ArrayList position
            return Optional.of(pList.get(position-1));
        }
    }

    /** Calculates the total payments made by the tenant
     * @return Returns the total value of payments recorded
     */
    public double calculateTotalPaid(){
        double totalPaid = 0; // initialize totalPaid
        // loop through all payments
        for(Payment payment:pList){
            // add current payment to running total
            totalPaid += payment.getAmount();
        }
        return totalPaid;
    }

    @Override
    public String toString() {
        return pList.toString();
    }
}
