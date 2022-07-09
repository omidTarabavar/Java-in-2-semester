public class Incubator {
    private int temperature;
    public static int MAX;
    public static int MIN;
    public Incubator(){
        temperature = 5;
    }
    public int getTemperature() {
        return temperature;
    }
    public boolean increaseTemperature(){
        if(temperature <10){
            temperature += 1;
            return true;
        }
        else {
            return false;
        }
    }
    public boolean decreaseTemperature(){
        if(temperature>-10){
            temperature -= 1;
            return true;
        }
        else {
            return false;
        }
    }
}
