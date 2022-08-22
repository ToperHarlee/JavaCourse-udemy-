package Lesson23OverridingHidingFinal;

public class Test8 {
    //super обращение к переменным и методам родительского класса
    String s1 = "privet";
    static double d = 3.14;
    int summa (int ...i) {
        int res = 0;
        for (int a: i) {
            res = res + a;
        }
        return res;
    }
    static void abc () {
        System.out.println("static method");
    }
}


class B10 extends  Test8 {
//    String s1 = super.s1 + ", friend";
    //boolean s1 = true;
    double d1 = super.d;
    String s1 = super.s1;
    @Override
    int summa(int... i) {
        int res = super.summa(i);
        System.out.println("Summa" + res);
        super.abc();
        return res;
    }

    public static void main(String[] args) {
      B10 b = new B10();
        System.out.println(b.s1);
    }
}