package Chapter14;

import java.util.Optional;

public class TimeTable {

    private Booking times[][];
    public TimeTable(int dayIn,int periodIn){
        if(dayIn > 5 || periodIn > 7){
            throw new TimeTableException("The equipment is available for use 5 days a week and for 7 periods during each day");
        }
        times = new Booking[dayIn][periodIn];
    }
    public void makeBooking(int dayIn,int periodIn,Booking time){
        if(times[dayIn][periodIn] != null){
            throw new TimeTableException("Already reserved!");
        }
        else {
            times[dayIn][periodIn] = time;
        }
    }
    public void cancelBooking(int dayIn,int periodIn){
        if(times[dayIn][periodIn] == null){
            throw new TimeTableException("Its already empty!");
        }else {
            times[dayIn][periodIn] = null;
        }
    }
    public boolean isFree(int dayIn,int periodIn){
        return times[dayIn][periodIn] == null;
    }
    public Optional<Booking> getBooking(int dayIn, int periodIn){
        if(!isFree(dayIn,periodIn)){
            return Optional.of(times[dayIn][periodIn]);
        }
        return Optional.empty();
    }
    public int numberOfDays(){
        return times.length;
    }
    public int numberOfPeriods(){
        return times[0].length;
    }

}
