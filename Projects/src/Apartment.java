import java.util.ArrayList;

public class Apartment {

    private ArrayList<Oblong> rooms = new ArrayList<>();

    public void add(Oblong Room){
        rooms.add(Room);
    }
    public double getRoomArea(int roomNumber){
        if(rooms.get(roomNumber-1)!=null){
            return rooms.get(roomNumber-1).calculateArea();
        }
        else {
            return -999;
        }
    }
    public double getRoomLength(int roomNumber){
        if(rooms.get(roomNumber-1)!=null){
            return rooms.get(roomNumber-1).getLength();
        }
        else {
            return -999;
        }
    }
    public double getRoomHeight(int roomNumber){
        if(rooms.get(roomNumber-1)!=null){
            return rooms.get(roomNumber-1).getHeight();
        }
        else {
            return -999;
        }
    }
}
