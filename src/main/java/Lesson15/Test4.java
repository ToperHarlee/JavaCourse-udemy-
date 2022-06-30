package Lesson15;

public class Test4 {

    public static void main(String[] args) {
        int a = 5;//6

        while (++a > 10) {
            a++;
        }
        System.out.println(a);//6

        while (++a < 10) {
            a++;
        }
        System.out.println(a);//10

        while (a++ < 10) {
            //после того как вернет 11 всеравно в условии еще увеличит на 1 без разницы false или true
            a++;
        }
        System.out.println(a);//12
    }
}
