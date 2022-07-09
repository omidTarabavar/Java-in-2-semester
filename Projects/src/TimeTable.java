public class TimeTable {

    private Booking times[][];
    public TimeTable(int dayIn,int periodIn){
        times = new Booking[dayIn][periodIn];
    }
    public boolean makeBooking(int dayIn,int periodIn,Booking time){
        if(times[dayIn][periodIn] == null){
            times[dayIn][periodIn] = time;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean cancelBooking(int dayIn,int periodIn){
        if(times[dayIn][periodIn] != null){
            times[dayIn][periodIn] = null;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean isFree(int dayIn,int periodIn){
        return times[dayIn][periodIn] == null;
    }
    public Booking getBooking(int dayIn,int periodIn){
        return times[dayIn][periodIn];
    }
    public int numberOfDays(){
        return times.length;
    }
    public int numberOfPeriods(){
        return times[0].length;
    }

}
