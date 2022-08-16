package Chapter14;

import java.util.Scanner;

public class ExceptionsQ4 {
    static Scanner keyboard  = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            int[] someArray = {12,9,3,11};
            int position = getPosition();
            display(someArray,position);
        }

        catch (NumberFormatException | ArrayIndexOutOfBoundsException | InvalidPositionException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some unforseen error");
            e.printStackTrace();
        }
        finally {
            System.out.println("End of program");
        }
    }

    /** to ask user about the item's position
     * @return : position that user entered
     * @throws NumberFormatException when input has non-numerical characters
     */
    static int getPosition(){
        System.out.print("Enter array position to display: ");
        String positionEntered = keyboard.next();
        return Integer.parseInt(positionEntered);
    }

    /** diplay item in the array with the given position
     * @param array : array of our items
     * @param position : position of the requested item
     * @throws InvalidPositionException when the position is invalid
     */
    static void display(int[] array,int position){
        if(position < 0 || position >= array.length){
            throw new InvalidPositionException();
        }else {
            System.out.println("Item at this position is: "+array[position]);
        }
    }
}
