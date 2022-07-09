public class vampireNumber {
    public static void main(String[] args) {

        for(int i = 1000 ; i< 10000 ; i++){
            if(findVampNum(i)){
                System.out.println(i);
            }
        }

    }
    static boolean findVampNum(int numIn){
        char[] charArray = numToCharArray(numIn);
        for(int i=0;i<charArray.length;i++){
            int num1 = charArray[i]-'0';
            int indxNum1 = i;
            if(num1 == 0){
                continue;
            }
            for(int j=0;j<charArray.length;j++){
                int num2 = charArray[j]-'0';
                int indxNum2 = j;
                if(indxNum2 == indxNum1){
                    continue;
                }
                for(int k=0;k<charArray.length;k++){
                    int num3 = charArray[k]-'0';
                    int indxNum3 = k;
                    if(indxNum3 == indxNum1 || indxNum3 == indxNum2){
                        continue;
                    }
                    for(int m=0;m<charArray.length;m++){
                        int num4 = charArray[m]-'0';
                        int indxNum4 = m;
                        if((indxNum4 == indxNum1)|| (indxNum4 == indxNum2) || (indxNum4 == indxNum3)){
                            continue;
                        }
                        int twoDigitNum1 = num1 * 10 + num2;
                        int twoDigitNum2 = num3 * 10 + num4;
                        if((twoDigitNum1 * twoDigitNum2) == numIn){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    static char[] numToCharArray(int numIn){
        String numInString = ""+numIn;
        int len = numInString.length();
        char[] charArray = new char[len];
        for(int i=0;i<len;i++){
            charArray[i] = numInString.charAt(i);
        }
        return charArray;
    }
}
