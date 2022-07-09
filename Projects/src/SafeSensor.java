public class SafeSensor extends Sensor{
    private double max;

    public SafeSensor(double max){
        super(10);
        this.max = max;
    }
    public SafeSensor(double max,double pressure){
        super(pressure);
        if(max < pressure){
            super.setPressure(max);
        }
        this.max = max;
    }
    @Override
    public boolean setPressure(double pressureIn){
        if((pressureIn <= max) &&(pressureIn >= 0)){
            super.setPressure(pressureIn);
            return true;
        }
        else {
            return false;
        }
    }


}
