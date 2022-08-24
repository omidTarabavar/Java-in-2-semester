package Chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapMethod {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("lauraHaliwell","unicorn");
        if(users.containsKey("lauraHaliwell")){
            System.out.println("user ID already taken");
        }else {
            users.put("lauraHaliwell","unicorn");
        }
        if(users.containsValue("unicorn")){
            System.out.println("There is a user with a unicorn password already");
            users.put("lucyLane","somePassword");
        }else {
            users.put("lucyLane","unicorn");
        }
        users.put("Omid","13820304");
        users.put("Mohammad","1386");
        System.out.print("Enter username: ");
        String userName = keyboard.next();
        System.out.print("Enter password: ");
        String password = keyboard.next();
        String correctPassword = users.get(userName);
        if(correctPassword != null){
            if(password.equals(correctPassword)){
                System.out.println("Correct!");
            }else {
                System.out.println("INVALID PASSWORD!");
            }
        }else {
            System.out.println("INVALID USERNAME!");
        }
        System.out.println("Full List: "+users);
        System.out.println("Removing Mohammad....");
        users.remove("Mohammad");
        System.out.println("Full List: "+users);
    }
}
