package Lesson20ArrayList;

import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder s = new StringBuilder("poka");
        list.add(s);
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("poka") );
        list.add(new StringBuilder("hello"));//добавляет элементы начиная с индекса или просто добавляет
        list.add(new StringBuilder("ok"));
        for (StringBuilder sc: list){
            System.out.println(sc + " ");
        }
        System.out.println(list.indexOf(new String("poka")));
        System.out.println(list.lastIndexOf(new String("poka")));
        System.out.println(list.size());
        System.out.println(list.isEmpty());//вернет false(или true если пустой)
        System.out.println(list.contains("poka"));//true тк содержит элемент пока
        System.out.println(list.contains(new StringBuilder("poka")));//false тк новый обьект
        System.out.println(list.contains(s));//true тк новый обьект
        System.out.println(list.toString());
    }
}
