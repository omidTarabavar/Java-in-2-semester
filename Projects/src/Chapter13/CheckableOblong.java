package Chapter13;

public class CheckableOblong extends Oblong implements Checkable{

    public CheckableOblong(double length, double height) {
        super(length, height);
    }

    @Override
    public boolean check() {
        return getLength() > 0 && getHeight() > 0;
    }
}
