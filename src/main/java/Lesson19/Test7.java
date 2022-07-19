package Lesson19;

public class Test7 {
    public static void main(String[] args) {
        int [] array = {0, 6, 4, 1};
//        String [] arrayStr = {"privet", "poka", "ok"};
        StringBuilder sb1 = new StringBuilder("privet");
        StringBuilder sb2 = new StringBuilder("poka");
        StringBuilder sb3 = new StringBuilder("ok");
        StringBuilder [] arrayStr = {sb1, sb2, sb3};
        /*for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }*/
        for (int a: array) {
            a = 3;
        }
        for (StringBuilder sb: arrayStr) {
            sb = new StringBuilder("hello");
        }
        for (StringBuilder sb: arrayStr) {
            sb.append("Java");//с помощью методов можно изменить значение обьектов но сам обьект изменить нельзя
        }
        //foreach  не меняет значение обьекта
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
