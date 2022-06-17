package Homework.Lesson10РHomeWorkP1.Lesson10РHomeWorkP2;

public class ClassB {

    public static String x = "Go";
    public static String y = "On";

    public static void  s4italka () {
        int myARR[] = new int[5];
        for (int i = 0; i < myARR.length; i++){
            myARR[i] = i;
            System.out.println( myARR[i] + "");
        }
    }

    public static void showMust(String arg1, String arg2) {
        System.out.println("Show must" + arg1 + arg2);


    }

    public static void main(String[] args) {
        s4italka();
        showMust(x,y);
    }

}
