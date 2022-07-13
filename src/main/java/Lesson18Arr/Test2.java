package Lesson18Arr;

public class Test2 {
    //dinamic initialization
    public static void main(String[] args) {
        int [] array8, a;
        int b[], c;
        c= 5;//c - переменная
        int []d, e[][];//d - одномерный массив, e - двумерный массив
        String [] array1;
        int [][] array2;
        int [] array20 [] [];

        array1 = new String[3];
        array2 = new int[3][];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = "privet" + i;
            System.out.println(array1[i]);
        }
        //задаем длинну вложенных массивов
        array2[0] = new int[5];
        array2[1] = new int[2];
        array2[2] = new int[7];

        for (int i = 0; i < array2.length; i++) {
            //цикл для перебора вложенных массивов
            for (int j = 0; j < array2[i].length; j++) {
                array2[i] [j] = i + j;
                System.out.println(array2[i] [j]);
            }
        }
    }
}
