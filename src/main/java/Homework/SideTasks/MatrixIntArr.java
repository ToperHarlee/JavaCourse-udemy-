package Homework.SideTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
/*вывести массив в виде
        1 2 3 4 5 6
        2 3 4 5 6 1
        3 4 5 6 1 2
        4 5 6 1 2 3
        5 6 1 2 3 4
        6 1 2 3 4 5
         */

//перебрать запомнить индексы смещенных элементов и во втором цикле вывести при этом в первом
//менять местами

//upd дан массив упорядоченных чисел я применю к нему методы которые его приведут в соотв вид
/* 1 2 3 4 4 5 6
   1 2 3 4 4 5 6
   1 2 3 4 4 5 6
   1 2 3 4 4 5 6
   1 2 3 4 4 5 6
   1 2 3 4 4 5 6
 */

//upd2. попробую через ArrayList
public class MatrixIntArr {

    public static int[][] pyramideMatrix(int cells) {

        int index = cells * cells;

        int[][] arr = new int[7][7];
        int indexCount = 0;
        int indexCount2;
        for (int i = 0; i < arr.length; i++) {
            for (int j =  1; j < arr[i].length; j++) {
                indexCount++;
                arr[i][j] = i + j;
                System.out.print(j + " \t");
                if (j == 1 || indexCount == i) {
                    //Collections.swap(Arrays.asList(arr), 1,3);
                    swapElems(arr,1,3);
                }
            }
            System.out.println("\n");
        }
        return arr;
    }
    //конвертировать двумерный массив в лист
    public List<Integer> toList (Integer[][] array) {
        List list = new ArrayList();
        for (Integer[] i : array) {
            list.addAll(Arrays.asList(i));
        }
        return list;
    }

    public static void swapElems(int[][] arr, int el1, int el2) {
        Arrays.stream(arr).forEach(el -> {
            int temp = el[el2];
            el[el2] = el[el1];
            el[el1] = temp;
        });
    }



    public static void main(String[] args) {
        //pyramideMatrix(7);

        int [] [] arr = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
        //перебрать в цикле и поменять местями через метод swap когда цикл проходит по встроенным массивам
        int indCount = 0;
        //List<Integer> target = new ArrayList<>();
        //swapEls(arr,1,3,4);
        //Arrays.stream(arr).map(Arrays::toString).forEach(System.out::println);

        //----------------------------------------------------

        /*Можно сделать ArrayList из одномерных массивов,
        ну и при циклическом сдвиге добавлять в лист последний элемент,
        затем удалять последний элемент.*/

        //-------------------------------------------------
        //формирование и вывод матрицы
        final int n = 6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(1 + (j + i) % n);
                System.out.print('\t');
            }
            System.out.println();
        }


        int[][] a = new int[n][];
        for (int i = 0; i < n; i++) {
            a[i] = i == 0
                    ? IntStream.rangeClosed(1, n).toArray()
                    : Arrays.copyOf(a[i - 1], n);
            if (i > 0) {
                int x = a[i][0];
                for (int j = 0; j < n - 1; j++) {
                    a[i][j] = a[i][j + 1];
                }
                a[i][n - 1] = x;
            }
            System.out.println(Arrays.toString(a[i]));
        }

        //-----------------------------------------------------------

        int[][] array = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};
        System.out.println("До:");
        IntStream.range(0, array.length)
                .forEach(i -> {IntStream.range(0, array[i].length)
                        .forEach(j -> System.out.printf("%5d", array[i][j]));
                    System.out.println("");});
        shiftLeft(array);
        System.out.println("После:");
        IntStream.range(0, array.length)
                .forEach(i -> {IntStream.range(0, array[i].length)
                        .forEach(j -> System.out.printf("%5d", array[i][j]));
                    System.out.println("");});

    }

    private static void shiftLeft(int[][] arr) {
        int len = arr[0].length;
        int[] col = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            col[j] = arr[j][0];
            System.arraycopy(arr[j], 1, arr[j], 0, len - 1);
            arr[j][len - 1] = col[j];
        }
    }
}

