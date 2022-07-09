package Mosabeghe;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        String[] myArray = new String[n];
        for(int i=0;i<n;i++){
            myArray[i] = keyboard.next();
        }
        boolean done= false;
        int k =1;
        for(int i=0;i<n;i++){
            char[] temp = convertToChar(myArray[i]);
            while (k<temp.length) {
                for (int j = temp.length - 1; j >= 0; j--) {
                    for (int l = j; l > (j - k); l--) {
                        if (temp[j] > temp[l]) {
                            char tempChar = temp[j];
                            temp[j] = temp[l];
                            temp[l] = tempChar;
                            for (int m = temp.length - 1; m > l; m--) {
                                for (int q = m - 1; q > l; q--) {
                                    if (temp[m] < temp[q]) {
                                        tempChar = temp[m];
                                        temp[m] = temp[q];
                                        temp[q] = tempChar;
                                    }
                                }
                            }
                            done = true;
                            break;
                        }
                        if (done) {
                            break;
                        }
                    }
                    if (done) {
                        break;
                    }

                }
                break;
            }
            if(done){
                for(int h = 0;h<temp.length;h++){
                    System.out.print(temp[h]);
                }
                System.out.println();
                done= false;
            }
            else {
                System.out.println("no answer");
            }

        }
    }
    static char[] convertToChar(String inputIn){
        char[] temp = new char[inputIn.length()];
        for(int i=0;i<inputIn.length();i++){
            temp[i] = inputIn.charAt(i);
        }
        return temp;
    }
}
