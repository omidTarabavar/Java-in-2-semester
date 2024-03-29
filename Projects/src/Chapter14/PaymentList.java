package Chapter14;

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
     * @throws HostelException If the list is sized with a non-positive value
     */
    public PaymentList(int MAX){
        pList = new ArrayList<>();
        if(MAX < 1){
            throw new HostelException("invalid list size set "+MAX);
        }else {
            this.MAX = MAX;
        }
    }

    /** Adds a new payment to the end of the list
     * @param payment : The payment to add
     * @return Returns true if the object was added successfully and false otherwise
     */
    public boolean addPayment(Payment payment){
        if(!isFull()){
            pList.add(payment);
            return true;
        }
        return false;
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
     * @return Returns an Optional which contain Payment if the position is valid or null if it's not valid
     */
    public Optional<Payment> getPayment(int position){
        return Optional.of(pList.get(position-1));
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
