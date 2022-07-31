package Lesson20ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        ArrayList<StringBuilder>list2 = (ArrayList<StringBuilder>) list.clone();
        ArrayList<StringBuilder> list3 = list;
        System.out.println(list == list2);//false
        System.out.println(list == list3);//true
        System.out.println(list.get(0) == list2.get(0));//true тк ссылаются на один обьект
        list.get(0).append("!!!");
        list.set(0, new StringBuilder("D"));
        System.out.println(list2.get(0));//!!!

        Object [] array1 = list.toArray();//преобразовать ArrayList в массив
        for (Object j:array1) {
            System.out.println(j);
        }
        //to array - создает новый массив
        StringBuilder [] array2 = list.toArray(new StringBuilder[10]);//добавлять элементы в массив из ArrayLISt
        for (StringBuilder s2: array2) {
            System.out.println(s2);
        }
        System.out.println(array2.length);

        //asList
        StringBuilder[] array3 = {sb2, sb3, sb3, sb3};
        List<StringBuilder> listB = Arrays.asList(array3);
        System.out.println(listB);
        array3[0].append("!!!");
        System.out.println(listB);
        array3[0] = new StringBuilder("!!!!!");



    }
}
