package Mosabeghe;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        boolean done=false;
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        int[] numArray = new int[1000];
        for(int i = 0;i<n;i++){
            int start = keyboard.nextInt();
            int end = keyboard.nextInt();
            int k =0;
            for(int j = 1;j<=(end-start+1);j++){
                int len = lenArray(numArray);
                numArray[len] = start+k;
                k++;
            }
        }
        int start = keyboard.nextInt();
        int end = keyboard.nextInt();
        int k =0;
        for(int i=0;i<(end-start+1);i++){
            if(findIn(numArray,start+k)){
                k++;
            }
            else {
                System.out.println("false");
                done = true;
                break;
            }
        }
        if(!done){
            System.out.println("true");
        }
    }
    static int lenArray(int[] arrayIn){
        int k = 0;
        for(int i=0;i<arrayIn.length;i++){
            if(arrayIn[i] != 0){
                k++;
            }
            else {
                return k;
            }
        }
        return k;
    }
    static boolean findIn(int[] arrayIn,int num){
        for(int i = 0;i<lenArray(arrayIn);i++){
            if(arrayIn[i] == num){
                return true;
            }
        }
        return false;
    }
}
