package Homework;

import java.lang.module.FindException;
import java.util.Arrays;

public class Lesson18HpmeWork {
    //1
    public static void sortirovka(int[] arr) {
        int[] resArr = arr;
        Arrays.sort(resArr);
        for (int i = 0; i < resArr.length; i++) {
            System.out.println(resArr[i] + " ");
        }
    }

    public static void sortirovka2(int[] arr) {
/*     Здесь нужно последовательно сравнивать значения соседних элементов и менять числа местами,
       если предыдущее оказывается больше последующего.
       Таким образом элементы с большими значениями оказываются в конце списка, а с меньшими остаются в начале*/
        for (int i = 0; i < arr.length; i++) {
            int min;
            for (int j = i + 1; j < arr.length; j++) {//j = i + 1 -- итерация следующего индекса(второй в паре)
                if (arr[i] > arr[j]){
                    min = arr[i];
                    arr[i] = arr[j];//первый элемент становится вторым а второй первым при их неравенстве
                    arr[j] = min;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");
        }
    }
    //2
    public static void showArray (String [] [] arr) {
        System.out.println(Arrays.deepToString(arr));
    }

    public static void showArray2 (String [] [] arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(Arrays.toString(arr[j]));
        }
    }

    public static void showArray3 (String [] [] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1){
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j] + " , ");
                }
            }
            if (i == arr.length - 1){
                System.out.print("}");
            } else {
                System.out.print("},");
            }
        }
        System.out.print("}");
    }

    public static void showArray4 (String [] [] arr) {
        System.out.print("{");
        int count = 0;
        int index = 0;
        for (String [] array: arr) {
            count++;
            System.out.print("{");
            for (String i: array) {
                index++;
                if (index == array.length){
                    System.out.print(i);
                } else {System.out.print(i + ",");}
            }
            if (count == array.length){
                System.out.print("}");
            } else {
                System.out.print("},");
            }
        }
        System.out.print("}");
    }
}

class TestHW {
    public static void main(String[] args) {
        int array1[] = {1,9,3,-8,0,5,4,1};
        String array2 [] [] = {{"Knopa", "Vera"}, {"Mike"}, {"Dogg", "LEdokol"}};
        Lesson18HpmeWork res = new Lesson18HpmeWork();
        res.sortirovka(array1);

        res.sortirovka2(array1);

        res.showArray(array2);
        res.showArray2(array2);
        System.out.println();
        res.showArray3(array2);
        res.showArray4(array2);
    }
}
