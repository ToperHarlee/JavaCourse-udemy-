package Homework;

public class Lesson3HomeWork {

    public static void main(String[] args) {
        //1. вычислить часть кода
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = (i2 / d1) +(d2 % i1) - l;
        System.out.println(i2 / d1);//2
        System.out.println(d2 % i1);//1.3
        System.out.println(3.3 - l);//-16.7
        result = -16.7;

        //2. чему равны выражения
        int a = 5;
        int res = a-- - --a + ++a + a++ + a;//5 - 3 + 4 + 4 + 5
        System.out.println(res);//15

        int b = 8;
        int anotherRes = ++b - b++ + ++b - --b;//1
        System.out.println(anotherRes);

        char k = 'a';//каждая буква в юникоде = численное значение
        int i = 7;
        System.out.println(k + i);//107

        boolean bool1 = false;
        boolean bool2 = bool1 = true;
        System.out.println(bool2);//true
    }
}
