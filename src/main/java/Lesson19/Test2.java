package Lesson19;

public class Test2 {
    //varargs - по сути это массив аргументов
    //в листе параметров varargs может быть последним и должен быть только один
    //массив может находится где угодно в списке параметров
    static void summa (String s, int ... a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa = summa + a[i];//при первом прохождении сумма = 6 потом следующий индекс будет тем
            //который ввели в аргументе метода т.е 3 и он уже будет суммирован с 6 т.е сумма станет 9 итд
        }
        System.out.println(summa);
        System.out.println(s);
    }

    public void abc(int[] ... array) {
        //в параметры можно передать массив
    }

    public static void main(String... args) {
        summa("ok");
        summa("ok",6);
        summa("ok",6,3,10);
        summa("ok", new int[] {1, 2, 3});
    }

//    static void summa (int a, int b){
//        System.out.println(a + b);
//    }
//
//    static void summa (int a, int b, int c){
//        System.out.println(a + b + c);
//    }
//
//    static void summa (int a, int b, int c, int d){
//        System.out.println(a + b + c + d);
//    }


}
