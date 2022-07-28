
public class RecursivePowerSet {
    static void powerSet(int index,String str,String curr) {
        if(index == str.length()){
            return;
        }
        System.out.println(curr);
        for(int i = index + 1;i<str.length();i++){
            curr += str.charAt(i);
            powerSet(i,str,curr);
            curr = curr.substring(0,curr.length()-1);
        }

    }
    public static void main (String[]args){
        int index = -1;
        String str = "abc";
        String curr="";
        System.out.println("String : "+str);
        powerSet(index,str,curr);
    }
}

