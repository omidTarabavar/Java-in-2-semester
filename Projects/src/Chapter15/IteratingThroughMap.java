package Chapter15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IteratingThroughMap {

    public static void main(String[] args) {
        Map<String,String> users = new HashMap<>();
        users.put("Omid","13820304");
        users.put("Mohammad","1386");
        users.put("Ali","1354");
        users.put("Erfan","1381");
        System.out.println("\nIterate using enhanced for loop: ");
        Set<String> theKeys = users.keySet();
        for(String username:theKeys){
            String password = users.get(username);
            System.out.println(username+"\t"+password);
        }
        System.out.println("\nIterate using foreach: ");
        users.forEach((username,password) -> System.out.println(username+"\t"+password));
    }
}
