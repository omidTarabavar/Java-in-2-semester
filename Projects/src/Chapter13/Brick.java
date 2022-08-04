package Chapter13;

public class Brick implements Calculatable{
    private double length;
    private double width;
    private double height;

    public Brick(double length,double width,double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return length*width*height;
    }
}
