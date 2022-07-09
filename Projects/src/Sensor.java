public class Sensor {

    private double pressure;
    public Sensor(double pressureIn){
        if(pressureIn >= 0)
            pressure = pressureIn;
        else {
            pressure= 0;
        }
    }
    public Sensor(){
        pressure = 0;
    }
    public boolean setPressure(double pressureIn){
        if(pressureIn >= 0){
            pressure = pressureIn;
            return true;
        }
        else {
            return false;
        }
    }
    public double getPressure(){
        return pressure;
    }
}
