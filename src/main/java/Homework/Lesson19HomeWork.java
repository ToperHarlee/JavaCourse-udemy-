package Homework;

import java.util.Arrays;
import java.util.List;
/*
    Создайте метод abc, инпут параметра котоорго - N-ое количество массивов типа String.
    В методе создайте новый массив, который будет состоять из элементов массивов-параметров
    и будт оутпутом данного метода.
    В методе main вызовите метод abc и его элементам, которые равны значениям command line парамемтров,
    присвойте значение null.
    Выведите элементы обновлённого массива на экран.
    Везде, где возможно, используйте foreach loop.
    Запустите приложение с командной строки.
 */
public class Lesson19HomeWork {
    public static String[] abc (String [] ...strings) {
        int lenghtArr = 0;//сделать как длинну массива
        int index = 0;
        for (int i = 0; i < strings.length; i++){
            lenghtArr = lenghtArr + strings[i].length;
        }
        String [] strArr = new String[lenghtArr];

        for (String[] strings1: strings) {
            for (String s: strings1) {
                strArr[index] = s;
                index++;
                //Arrays.fill(strArr,null);
                System.out.print(s + " , ");
                if(s.equals(null) || s == null) {
                    break;
                }
            }
        }
        return strArr;
    }
}

class Test19 {
    public static void main(String[] args) {
        Lesson19HomeWork res = new Lesson19HomeWork();
        String[] s1 = new String[]{"asdasda", "asdasdad", "asdasdsssss", " sadasdfsdfgg"};
        String[] s2 = new String[]{"asdasda", "asdasdad", "asdasdsssss"};
        res.abc(s1, s2);

        check(args, s1, s2);
    }

    private static void check(String[] args, String [] ...sss) {
        for (String s : args) {
            for (int i = 0; i < sss.length; i++) {
                if (s.equals(sss[i])) {
                    Arrays.fill(sss, null);
                } else {
                    System.out.println("NullPointerExeption");
                }
            }
        }
    }
}