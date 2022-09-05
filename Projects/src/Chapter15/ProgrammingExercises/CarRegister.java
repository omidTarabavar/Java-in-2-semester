package Chapter15.ProgrammingExercises;

import java.util.HashSet;
import java.util.Set;

public class CarRegister {
    private Set<String> permit;
    private Set<String> parked;
    private int capacity;

    public CarRegister(int capacity) throws CarRegisterException {
        if(capacity >= 0) {
            permit = new HashSet<>();
            parked = new HashSet<>();
            this.capacity = capacity;
        }else {
            throw new CarRegisterException();
        }
    }
    public boolean givePermit(String registration){
        return permit.add(registration);
    }
    public boolean recordParking(String registration){
        if(permit.contains(registration) && parked.size() != capacity){
            parked.add(registration);
            return true;
        }
        return false;
    }
    public boolean recordExit(String registration){
        if(parked.contains(registration)){
            return parked.remove(registration);
        }
        return false;
    }
    public boolean isParked(String registration){
        return parked.contains(registration);
    }
    public boolean isFull(){
        return parked.size() == capacity;
    }
    public int numberParked(){
        return parked.size();
    }
    public Set<String> getPermit(){
        return permit;
    }
    public Set<String> getParked() {
        return parked;
    }
    public int getCapacity() {
        return capacity;
    }
}
