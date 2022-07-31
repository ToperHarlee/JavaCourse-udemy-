package Homework;

import java.util.*;

public class Lesson20HomeWork {
/*Set – это коллекция уникальных элементов, или коллекция, которая не позволяет хранить одинаковые элементы.*/
    public static ArrayList<String> abc (String ...s) {
       ArrayList<String> list = new ArrayList<>();
        for (String  x: s) { // ...s это массив и перебирать нужно его добавляя значения в лист
            Collections.sort(list);
                if (list.contains(x)){ // если коллекция содержит уже введеное значение то пофиг если нет добавляем в лист
                } else list.add(x);
        }
        System.out.println(list.toString());
        return list;
    }




    //решение через стримы
    public static ArrayList<String[]> abc1 (String ...s) {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(s);
        for (String [] x: list) {
            Arrays.sort(x);
            System.out.println(Arrays.toString(Arrays.stream(x).distinct().toArray(String[]::new)));
        }
        return list;
    }


    public static void main(String[] args) {
        abc("b", "c", "d", "a", "a", "d");
    }
}
