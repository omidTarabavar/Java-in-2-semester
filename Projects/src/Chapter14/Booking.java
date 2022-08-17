package Chapter14;

public class Booking {
    private String room;
    private String name;
    public Booking(String roomIn, String nameIn){
        room = roomIn;
        name = nameIn;
    }
    public String getRoom() {
        return room;
    }
    public String getName() {
        return name;
    }

}
