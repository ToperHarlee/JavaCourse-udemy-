package Homework;

import java.util.Scanner;

public class Fibonachi {
    //Fo = 0;
    //F1 = 1;
    //Fn = Fn-1 + Fn-2
    // 0 1 1 2 3 5 8 13 21 34

    public void fibonachiFill (){
        //вводим число с клавы биндим его в переменную
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scaner.nextInt();

        int [] f = new int[n];
        f[0] = 0;//первые два числа будут 0 и 1
        f[1] = 1;

        for (int i = 2; i < n; i ++) {
            f[i] = f[i - 1] + f[i -2];//по формуле см.выше
        }

        for (int i = 0; i < n; i++) {
            System.out.println(f[i]);
        }
    }

    public static int recursiveFibonachi (int num) {
        int res;
        if (num == 1 || num == 2) {
            return  1;
        } else {
            res = recursiveFibonachi(num - 1) + recursiveFibonachi(num - 2);
        }
        return res;
    }

    public static void main(String[] args) {
        Fibonachi f = new Fibonachi();
        f.fibonachiFill();
        System.out.println("---------------------");
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = scaner.nextInt();
        System.out.println(recursiveFibonachi(n));
    }
}
