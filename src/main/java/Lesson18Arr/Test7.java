package Lesson18Arr;

public class Test7 {
    public static void main(String[] args) {
        char [] array = {'p','r','i','v','e','t'};
        String s = new String(array);
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello world");
        //sb.append(array, 2, 3);//с какой добавляем -2 и сколько добавляем в массив -3
        sb.insert(2, array, 1, 3);//всьавляем массив со второй позиции с 1 по 3 индекс
        System.out.println(sb);

    }
}
