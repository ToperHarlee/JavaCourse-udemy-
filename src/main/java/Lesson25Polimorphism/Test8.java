package Lesson25Polimorphism;

public class Test8 {
    int a, b = 3, c, d = b + 5;
    int a2, b2 = 3, c2, d2 = a2 + 5;

//    int a3, b3 = 3, c3 = 10 - d3, d3 =7; -- так ненадо тк d3 is not exist

    public static void main(String[] args) {
        Test8 t = new Test8();
        System.out.println(t.d);//8
        System.out.println(t.d2);//5
    }
}
