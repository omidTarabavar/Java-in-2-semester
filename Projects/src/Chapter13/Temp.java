package Chapter13;

import java.util.function.Supplier;

public class Temp {
    public static void main(String[] args) {
        Supplier<Void> voidSupplier = new Supplier<>() {
            @Override
            public Void get() {
                System.out.println("Hello");
                return null;
            }
        };
        voidSupplier.get();
    }
}
