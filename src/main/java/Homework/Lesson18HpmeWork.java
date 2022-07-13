package Homework;

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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " , ");
            }
        }
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
    }
}
