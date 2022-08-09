package Chapter14;

import java.io.IOException;

public class AptitudeTest2 {
    public static void main(String[] args) {
        try {
            int score;
            System.out.print("Enter atitude test score: ");
            score = TextException.getInteger();
            if(score >= 50){
                System.out.println("You have a place on the course!");
            }else {
                System.out.println("Sorry, you failed your test");
            }
        }catch (NumberFormatException numberFormatException){
            System.out.println("You entered an invalid number!");
        }catch (IOException ioException){
            System.out.println(ioException);
        }
        System.out.println("GoodBye");
    }
}
