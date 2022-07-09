package Mosabeghe;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int markazTozii = keyboard.nextInt();
        int mersole = keyboard.nextInt();
        int maxPack = keyboard.nextInt();
        int maxWeight = keyboard.nextInt();
        int[][] myArray = new int[mersole][2];
        for(int i=0;i<mersole;i++){
            myArray[i][0] = keyboard.nextInt();
            myArray[i][1] = keyboard.nextInt();
        }
        int travel=1;
        int startingPoint =0;
        while (startingPoint < mersole){
            int endingPoint = 0;
            for(int j=startingPoint;j<mersole-1;j++)
            {
                if(myArray[j][0] == myArray[j+1][0]){
                    endingPoint += 1;
                }
                else{
                    travel += 1;
                    break;
                }
            }
            startingPoint += endingPoint+1;
            travel += 1;
        }

        System.out.println(travel);
    }
}
