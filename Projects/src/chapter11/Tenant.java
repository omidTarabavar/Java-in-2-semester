package chapter11;

/** Class used to record the details of tenant
 * @author OmidTarabavar
 * @version 10 july 2022
 */
public class Tenant {
    private String name;
    private int room;
    private PaymentList payments;
    public static final int MAX = 12;

    /** Constructor initialises the name and room number of the tenant
     * and sets the payments made to the empty list
     * @param name: name of tenant
     * @param room: room number of tenant
     */
    public Tenant(String name,int room){
        this.name = name;
        this.room = room;
        payments = new PaymentList(MAX);
    }

    /** Records a payment for the tenant
     * @param payment: payment made by tenant
     */
    public void makePayment(Payment payment){
        payments.addPayment(payment); // call PaymentList method
    }

    /** Reads the name of the tenant
     * @return Returns the name of the tenant
     */
    public String getName() {
        return name;
    }

    /** Reads the room of the tenant
     * @return Returns the room of the tenant
     */
    public int getRoom() {
        return room;
    }

    /** Reads the payments of the tenant
     * @return Returns the payment made by the tenant
     */
    public PaymentList getPayments(){
        return payments;
    }

    @Override
    public String toString() {
        return name + ", "+room+", "+payments;
    }
}
