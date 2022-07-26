package Lesson20ArrayList;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hello");//добавляет элементы начиная с индекса или просто добавляет
        for (String s: list){
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
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("sidorov");
        list.addAll(1,list2);
        for (String s: list){
            System.out.println(s + " ");
        }
        list2.set(1,"Ivanov");
    }
}
