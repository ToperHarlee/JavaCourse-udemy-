package Lesson16;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("privet");

        String s10 = s1.substring(3);//присвоить для s10 значение s1 начиная с 3 индекса
        System.out.println(s10);
        System.out.println(s1);//s1 не меняется

        String s11 = s1.substring(3,7);//присвоить для s11 значение с 3 по  7
        System.out.println(s11);

        String s12 = s1.trim();// убирает пробелы и создает новый стринг
        System.out.println(s12);

        String s13 = s1.substring(3,11);//присвоить для s11 значение с 3 по 11, 11 элемента нет но жаба позволит так писать
        System.out.println(s13);

        String s14 = s1.replace("vet", "vivka");//замена элемента
        System.out.println(s14);

        String s2 = "poka";
        String s3 = s2.replace("k", "k");//char
        System.out.println(s2 == s3);//true тк при замене одинаковых элементов ссылатся будут на один и тот же обьект

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
        System.out.println(s5 + s6);


    }
}
