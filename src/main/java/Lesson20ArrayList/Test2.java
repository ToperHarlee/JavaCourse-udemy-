package Lesson20ArrayList;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1,new StringBuilder("hello"));//добавляет элементы начиная с индекса или просто добавляет
        for (StringBuilder s: list){
            System.out.println(s + " ");
        }

        ArrayList<Integer> list1 = new ArrayList<>();//можно передавать числовые значения
        //get
        System.out.println();
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.get(2));//вывод элемента по индексу 2

        //set
        //list.set(1,"asdasd");//заменяет значение на другое по индексу
        //remove - удаляет выбранный элемент
        //list.remove("poka");

        //addAll
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add( new StringBuilder("Petrov"));
        list2.add(new StringBuilder("sidorov"));
        list.addAll(1,list2);
        for (StringBuilder s: list){
            System.out.println(s + " ");
        }
        //set
        //list2.set(1,new StringBuilder("Ivanov"));
        //get
        list2.get(1).append("i");
        for (StringBuilder s: list){
            System.out.println(s + " ");
        }
        //clear
//        list.clear();
//        for (StringBuilder s: list){
//            System.out.println(s + " ");
//        }
        //indexOf

    }
}
