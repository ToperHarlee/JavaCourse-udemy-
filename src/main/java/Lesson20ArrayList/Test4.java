package Lesson20ArrayList;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(new StringBuilder("hello"));//добавляет элементы начиная с индекса или просто добавляет
        for (StringBuilder s: list){
            System.out.println(s + " ");
        }
        System.out.println(list.indexOf(new StringBuilder("poka")));
    }
}
