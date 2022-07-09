public class CircularShape {
    private final double PI = 3.14;
    private double radios;

    public CircularShape(double radiosIn){
        radios = radiosIn;
    }
    public void setRadios(double radiosIn){
        radios = radiosIn;
    }
    public double getRadios(){
        return radios;
    }
    public double calculateArea(){
        return PI*radios*radios;
    }
    public double calculateCircumference(){
        return 2*PI*radios;
    }
    public double calculateDiameter(){
        return 2*radios;
    }



}
