public class OurOblong {

    private double length,height;

    public OurOblong(double lengthIn,double heightIn){
        length = lengthIn;
        height = heightIn;
    }
    public double getLength(){
        return length;
    }
    public double getHeight(){
        return height;
    }
    public void setLength(double lengthIn){
        length = lengthIn;
    }
    public void setHeight(double heightIn){
        height = heightIn;
    }
    public double calculateArea(){
        return height * length;
    }
    public double calculatePerimeter(){
        return 2*(length+height);
    }











}
