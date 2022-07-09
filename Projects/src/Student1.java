public class Student1 {
    private String studentNumber;
    private String studentName;
    private int markForMaths=-999;
    private int markForEnglish=-999;
    private int markForScience=-999;
    private static double fee=3000;
    public Student1(String numberIn, String nameIn){
        studentNumber = numberIn;
        studentName = nameIn;
    }
    public String getNumber(){
        return studentNumber;
    }
    public String getName(){
        return studentName;
    }
    public void enterMarks(int mathIn,int englishIn,int scienceIn){
        markForMaths = mathIn;
        markForEnglish = englishIn;
        markForScience = scienceIn;
    }
    public double calculateAverageMark(){
        return (markForScience+markForEnglish+markForMaths)/3.0;
    }
    public static double getFee(){
        return fee;
    }
    public static void setFee(double feeIn){
        fee = feeIn;
    }
}
