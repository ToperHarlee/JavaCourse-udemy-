package Lesson20ArrayList;

import java.util.*;

//sort
public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s3);
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        ArrayList<String> list2 = list1;
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        System.out.println(list1.equals(list2));//true
        //2 ArrayList равны если содержат одинаковые элементы(порядок элементов тоже важен)
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        list4.add(s3);
        list3.add(s3);
        list3.add(s1);
        list3.add(s4);
        list3.add(s2);
        System.out.println(list1.equals(list3));
        System.out.println(list1.equals(list4));

        Iterator<String> it = list1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        ListIterator<String> it1 = list1.listIterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        //удалить элемент с помощью итератора
        while (it.hasNext()){
            it.next();
            it.remove();
        }
    }
}
