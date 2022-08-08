package Chapter13;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfacesExamples {


    public static void main(String[] args) {
        Supplier<Double> randomDoubleFinder = () -> {
            Random random = new Random();
            return random.nextDouble();
        };
        System.out.println("Supplier");
        System.out.println("Random Number: "+randomDoubleFinder.get());
        System.out.println("\nConsumer");
        Consumer<Customer> customerConsumer = customer -> System.out.println("Name: " + customer.getName() + "\nCustomer ID: " + customer.getCustomerId() + "\nCredit Limit: " + customer.getCreditLimit());
        Customer customer= new Customer("1A23","omid",200);
        customerConsumer.accept(customer);

        Predicate<String> checkCustomerID = s -> {
            int numberCount = 0;
            int letterCount = 0;
            if (s.length() != 4) {
                return false;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isLetter(s.charAt(i))) {
                        letterCount += 1;
                    } else if (Character.isDigit(s.charAt(i))) {
                        numberCount += 1;
                    }
                }
            }
            return (numberCount == 3 && letterCount == 1);
        };
        System.out.println("\nPredicate");
        System.out.println("Customer Id is "+checkCustomerID.test(customer.getCustomerId()));
    }
}
