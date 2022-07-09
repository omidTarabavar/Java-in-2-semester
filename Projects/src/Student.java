import java.util.Random;

public class Student {

    String name,family,stdNo;
    double gpa;
    String[] courses= new String[50];
    double[] marks= new double[50];
    int numOfCourses=0;

    public Student(String name, String family){
        this.name = name;
        this.family = family;
        Random random = new Random();
        String stdNo="";
        for(int i=1;i<=7;i++){
            if(i==1){
                stdNo += (random.nextInt(9) + 1);
            }
            else {
                stdNo += random.nextInt(10);
            }
        }
        this.stdNo = stdNo;
    }

    public void addMark(String nameOfCourse,double mark){
        if(numOfCourses < 50){
            courses[numOfCourses] = nameOfCourse;
            marks[numOfCourses] = mark;
            numOfCourses += 1;
        }
        else {
            System.out.println("You can not add more than 50 courses!");
        }
    }

    public double getMark(String nameOfCourse){
        for(int i = 0 ;i< numOfCourses;i++){
            if(courses[i].equals(nameOfCourse)){
                return marks[i];
            }
        }
        return -1;
    }

    public void computeGpa(){
        double sum = 0;
        for(int i = 0 ;i< numOfCourses;i++){
            sum += marks[i];
        }
        gpa = (sum / numOfCourses);
    }

    @Override
    public String toString(){
        return "name: "+name+"\t"+"family: "+family+"\t"+"stdNo: "+stdNo;
    }

    public String maxMark(){
        // in method bar in asas neveshte shode ke hata agar chand dars daraye nomreye max bashn, hamashon neveshte beshan
        double max = 0;
        int index=0;
        int[] indexArray = new int[50];
        int j = 0;
        String result = "";
        for(int i=0;i<numOfCourses;i++){
            if(marks[i] > max){
                index = i;
                max = marks[i];
            }
        }
        indexArray[0] = index;
        j += 1;
        for(int i=0;i<numOfCourses;i++){
            if(marks[i] == max && i != index){
                indexArray[j] = i;
                j += 1;
            }
        }
        for(int i=0;i<numOfCourses;i++){
            if(indexArray[i] != 0){
                result += courses[indexArray[i]] + ','+max+"\n";
            }
        }
        return result;
    }

    public void printTranscript(){
        System.out.println("------------Transcript------------");
        System.out.println("Name: "+name);
        System.out.println("Family: "+family);
        System.out.println("Student Number: "+stdNo);
        System.out.println("-------------------------");
        for(int i=0;i<numOfCourses;i++){
            System.out.println(courses[i]+": "+marks[i]);
        }
        System.out.println("-------------------------");
        computeGpa();
        System.out.println("GPA: "+gpa);
    }
    public static void main(String[] args) {
        Student me = new Student("Omid","Tarabavar");

        me.addMark("Zaban Englisi",19.5);
        me.addMark("Fizik 1",19);
        me.addMark("Farsi",17);
        me.addMark("Mabani Computer",19.29);
        me.addMark("Andisheh eslami",20);

        System.out.println(me.toString()+"\n");
        me.printTranscript();
        System.out.println("\n"+"Max: "+me.maxMark());
    }
}
