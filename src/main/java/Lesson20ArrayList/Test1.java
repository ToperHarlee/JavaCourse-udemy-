package Lesson20ArrayList;
import java.util.ArrayList;
import java.util.List;
public class Test1 {
    //массив типа Object могут быть обьекты но не примитивные типы данных
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");

        Car c = new Car();
        list.add(c);
        Studdent s = new Studdent();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("poka");
        //list2.add(s);если указал string то и добавлять в лист надо string
        ArrayList<StringBuilder>list3 = new ArrayList<>(30);
        list3.add(new StringBuilder("asdas"));
        List<StringBuilder> list4 = new ArrayList();
        list4.add(new StringBuilder("ok"));
        /*В List помещяются обьекты и все они ссылаются на класс LIST*/
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list5 == list2);//false
    }
}


class Car{}
class Studdent{}
