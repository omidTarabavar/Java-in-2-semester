package Chapter13;

public class Ball implements Calculatable{
    private double radius;

    public Ball(double radius){
        this.radius = radius;
    }
    @Override
    public double calculateVolume() {
        return (4*Math.PI*Math.pow(radius,3))/3;
    }
}
