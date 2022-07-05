package Lesson16;

public class Test1 {
    //методы string
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        int a = s1.length();//6
        System.out.println(a);

        char c1 = s1.charAt(3);//выведет 3й индекс в слове -- v
        System.out.println(c1);

        int i1 = s1.indexOf("t");//на каком индексе находится символ -- 5
        System.out.println(i1);

        int i2 = s1.indexOf("vet");//на каком индексе находится символ -- 3
        System.out.println(i2);

        int i3 = s1.indexOf("Z"); //если не найдено то будет - 1 индекс
        System.out.println(i3);

        int i4 = s1.indexOf("a", 5); //начиная с 5го индекса начинать поиск
        System.out.println(i4);

        boolean b1 = s1.startsWith("abc");// с каких символов начинается string
        System.out.println(b1);

        boolean b2 = s1.startsWith("abc", 7);// с каких символов начинается string начиная с 7 индекса
        System.out.println(b2);

        boolean b3 = s1.endsWith("cd");// с каких символов заканчивается string
        System.out.println(b1);


    }
}
