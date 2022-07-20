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


    public static void defg (String[] ...strings) {
        int count = 0;
//        String[] [] strArr = new String[strings.length][strings.length];
//        for (int i = 0; i < strings.length; i++) {
//            for (int j = 0; j < strings[j].length; j++) {
//                count++;
//                strArr[i] [j] = strings[i] [j];//приравниваем вводимый массив в создаваемый
//            }
//        }

        for (String[] arr1: strings) {
            count = count + arr1.length;
        }
        String [] strArr = new String[count];
        int index = 0;
//        System.out.println(Arrays.deepToString(strArr));
        for (String[] s1: strings) {
            for (String s2: s1) {
                strArr[index] = s2;
                index++;
                System.out.print(s2 + " ");
            }
        }
    }
}

class Test19 {
    public static void main(String[] args) {
        Lesson19HomeWork res = new Lesson19HomeWork();
        String[] s1 = new String[]{"asdasda", "asdasdad", "asdasdsssss", " sadasdfsdfgg"};
        String[] s2 = new String[]{"asdasda", "asdasdad", "asdasdsssss"};
        String[] s3 = new String[]{"Test3"};
        String[] s4 = new String[]{"Test4"};
        res.abc(s1, s2);
        res.defg(s1, s4);

        //check(args, s1, s2);
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