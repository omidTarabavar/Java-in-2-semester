package Chapter13;

import java.util.function.Function;

public class TestGenericInterfaceVersion1 {
    public static void main(String[] args) {
        Function<Integer,String> t = new Function<>() {
            @Override
            public String apply(Integer integer) {
                return "You entered: "+integer;
            }
        };
        System.out.println(t.apply(10));
    }
}
