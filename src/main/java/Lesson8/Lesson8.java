package Lesson8;

public class Lesson8 {
     //non acces modifiers
    //FINAl - значение менятся НЕ МОЖЕТ/read only
    //public int a = 10;
    //public final int a = 10;
    public static final int a = 10;
    //static const определяются сразу же а не в конструкторе

//    Lesson8(){
//        a = 10;
//    }
//
//    Lesson8(boolean b) {
//        a = 15;
//    }

    public void abc(final short s) {
        final byte b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        //Lesson8 t = new Lesson8();
        //t.a = t.a * 2;
        //t.a = 10;
        //System.out.println(t.a);
        System.out.println(a);
    }
}
