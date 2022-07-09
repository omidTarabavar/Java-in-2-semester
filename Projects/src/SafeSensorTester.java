public class SafeSensorTester {
    public static void main(String[] args) {;
        SafeSensor mySensor1 = new SafeSensor(15);
        SafeSensor mySensor2 = new SafeSensor(20,30);
        System.out.println(mySensor2.getPressure());
    }
}
