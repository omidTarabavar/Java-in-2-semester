package chapter11;

import java.util.ArrayList;

/** Collection class to hold a list of tenants
 * @author OmidTarabavar
 * @version 10 july 2022
 */
public class TenantList {
    private ArrayList<Tenant> tList;
    public final int MAX;

    /** Constructor initialises the empty tenant list and sets the maximum list size
     * @param MAX: The maximum number of tenants in the list
     */
    public TenantList(int MAX){
        tList = new ArrayList<>();
        this.MAX = MAX;
    }

    /** Add a new tenant to the list
     * @param tenant: The tenant to add
     * @return Returns true if the tenant was added successfully and false otherwise
     */
    public boolean addTenant(Tenant tenant){
        if(!isFull()){
            tList.add(tenant);
            return true;
        }
        return false;
    }

    /** Removes the tenant in the given room number
     * @param room: The room number of the tenant to remove
     * @return Returns true if the tenant is removed successfully or false otherwise
     */
    public boolean removeTenant(int room){
        Tenant findT = search(room);
        if(findT != null){
            tList.remove(findT);
            return true;
        }
        return false;
    }

    /** Searches for the tenant in the given room number
     * @param room: The room number to search for
     * @return Returns the tenant in the given room or null if no tenant in the given room
     */
    public Tenant search(int room){
        for(Tenant currentTenant: tList){
            if(currentTenant.getRoom() == room){
                return currentTenant;
            }
        }
        return null;
    }

    /** Reads the tenant at the given position in the list
     * @param position: The logical position of the tenant in the list
     * @return Returns the tenant at the given logical position in the list
     * or null if no tenant at that logical position
     */
    public Tenant getTenant(int position){
        if(position < 1 || position > getTotal()){
            return null;
        }
        return tList.get(position-1);
    }

    /** Reports on whether or not the list is empty
     * @return Returns true if the list is empty and false otherwise
     */
    public boolean isEmpty(){
        return tList.isEmpty();
    }

    /** Reports on whether or not the list is full
     * @return Returns true if the list is full and false otherwise
     */
    public boolean isFull(){
        return tList.size() == MAX;
    }

    /** Gets the total number of tenants
     * @return Returns the total number of tenants currently in the list
     */
    public int getTotal(){
        return tList.size();
    }

    @Override
    public String toString() {
        return tList.toString();
    }
}
