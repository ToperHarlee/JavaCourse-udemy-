package Lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s = "PrIVet:2";
        String s2 = s.toLowerCase();//все символы маленькие
        System.out.println(s2);

        String s3 = s.toUpperCase();//все символы большие

        boolean b = s.contains(":2");//содержит ли символы string
        System.out.println(b);//true
    }

}
