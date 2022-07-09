public class StudentTamrinTester {
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
