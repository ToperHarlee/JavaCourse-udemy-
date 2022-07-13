package Lesson18Arr;

public class Test1 {
    public static void main(String[] args) {
        //declaration Arr
        int[] array1;
        String[] array2;
        double[] [] array3;
        int [] [] array10;
        double []  array7;

        //location Arr
        array1 = new int[8];//8 длинна
        array2 = new String[3];
        array3 = new double[4][2];
        array10 = new int[3][];//если во вложенных массивах разная длинна
        array7 = new double[2];

        System.out.println(array2.length);

        //static initialization
        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "okey";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;
        double [] array5;

        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;
        array7 = array5;

        array3[1] = array5;//добавили массив в другой массив
        System.out.println(array3[1] [0]);
    }
}
