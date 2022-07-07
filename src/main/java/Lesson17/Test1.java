package Lesson17;
class Car{}

public class Test1 {
    public static void main(String[] args) {
        //StringBuilder - постоянно меняет свое значение
        StringBuilder sp1 = new StringBuilder();
        StringBuilder sp2 = new StringBuilder("good day!!!");
        StringBuilder sp22 = new StringBuilder("good day!!!");
        StringBuilder sp3 = new StringBuilder(50);//int -- 50 это вместимость
        StringBuilder sp4 = new StringBuilder(sp3);//ссылается нена sp3 но на обьект с таким же значением как у sp3


        System.out.println(sp2.length());//11
        System.out.println(sp3.length());//0
        System.out.println(sp2.charAt(4));//probel
        System.out.println(sp2.indexOf("o", 2));//только String значения
        //substring
        String s = sp2.substring(5);
        System.out.println(s);
        String s2 = sp2.substring(5, 8);
        System.out.println(s2);

        System.out.println(s2.subSequence(5,8));//тоже самое что и substring на выходе у него char
        //append
        sp2.append(22);//append - добавляет в конец string значение и меняет сам Substring
        System.out.println(sp2);
        sp2.append(true);
        System.out.println(sp2);
        sp2.append(sp2);
        System.out.println(sp2);

        //можно добавлять и обьект
        sp2.append(new Car());
        System.out.println(sp2);

        //insert -- расширенный append
        System.out.println(sp2.insert(4,55));
        System.out.println(sp2.insert(sp2.length(), "Hello"));

        //delete
        StringBuilder sb10 = new StringBuilder("Hello World");
        sb10.delete(3,6);//начиная с 3 го по 6(но не включая 6й) удаляются
        System.out.println(sb10);
        StringBuilder sb11 = new StringBuilder("Hello World");
        sb11.deleteCharAt(6);//удалить символ на 6м индексе
        System.out.println(sb10);

        //reverse
        sb10.reverse();//реверс строки
        System.out.println(sb10);

        //replace
        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0,5," pete");

        //capasity
        System.out.println(sb12.capacity());
    }
}
