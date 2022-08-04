package Chapter13;

public class TestComputable {
    public static void main(String[] args) {
       Computable<Double> doubleComputable = Double::sum;
       Computable<Integer> integerComputable = Integer::sum;
       System.out.println(doubleComputable.compute(20.2,1.2));
       System.out.println(integerComputable.compute(12,21));

    }



}
