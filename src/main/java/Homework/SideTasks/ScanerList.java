package Homework.SideTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScanerList {
    //написал метод, чтобы добавлять значения в массив String
    public static void scanerToList (String s) {
        String[] str = new String[]{};
        List<String> list = new ArrayList<>(Arrays.asList(str));
        list.add(s);
        for (String x: list) {
            System.out.println(x + "");
        }
    }

    public static String enterSymbol () {
        System.out.println("ВВедите слово");
        Scanner enterWord = new Scanner(System.in);
        String s = enterWord.next();
        return s;
    }

    public static void main(String[] args) {
        scanerToList(enterSymbol());
    }
}
