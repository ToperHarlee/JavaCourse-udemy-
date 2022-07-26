package Homework.SideTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MatrixVer2 {


    public  static  void Matrix ( int lenghtArr) {
        int[][] a = new int[lenghtArr][];
        for (int i = 0; i < lenghtArr; i++) {
            a[i] = i == 0
                    ? IntStream.rangeClosed(1, lenghtArr).toArray()
                    : Arrays.copyOf(a[i - 1], lenghtArr);
            if (i > 0) {
                int x = a[i][0];
                for (int j = 0; j < lenghtArr - 1; j++) {
                    a[i][j] = a[i][j + 1];
                }
                a[i][lenghtArr - 1] = x;
            }
            System.out.println(Arrays.toString(a[i]));
        }
    }

    public static int[][] Matrix2(int lenght) {

        int[][] arr = new int[lenght][lenght];

        for (int i = 0; i < arr.length; i++) {
            int count = i + 1 ;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
                if (count > arr.length ) {
                    count = 1;
                }
            }
        }
        for (int[] res: arr) {
            System.out.println("\n");
            for (int x: res) {
                System.out.print(x + " \t");
            }
        }
        return arr;
    }

    public  static int[][] Matrix3(int lenght) {

        int[][] arr = new int[lenght][lenght];
        int index = 0;
        for (int [] x : arr) {
            index++;
            System.out.println("\n");
            for (int a: x) {
                a = index;
                index++;
                System.out.print(a + " \t");
                if (index > lenght){
                    index = 1;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
         //Matrix(5);
         //Matrix(3);
         //Matrix2(5);
         Matrix3(6);

    }

}
