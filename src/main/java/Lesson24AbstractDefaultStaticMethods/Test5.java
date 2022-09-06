package Lesson24AbstractDefaultStaticMethods;

public class Test5 {

}
//Default
interface I1 {
//    void abc();
//    default void ghi() {
//        System.out.println("eto method ghi");
//    }
//    default void def() {
//        System.out.println("eto method def");
//    }
    default void abc() {
        System.out.println("eto method abc");
    }
    static void def () {
        System.out.println("static method");
    }
}

interface I2 extends I1{
//     void abc();
    static void def () {
        System.out.println("static method 2");
    }
}

//abstract class R implements I1{
//    @Override
//    abstract public void abc();
//}

//class R implements I1,I2 {
//    public static void main(String[] args) {
//        I1.def();
//        I2.def();
//    }
//}

abstract class O {

}
class R  extends O implements I1{
    O method1() {
        return new R();
    }

    static I1 method2(I2 i) {
        return new D2();
    }

    public static void main(String[] args) {
        I2 i = new D2();
        method2(i);
    }
}

class D2 implements I2 {
}

//class Z2 implements I1 {
//    @Override
//    public void abc() {
//        System.out.println("eto method abc");
//    }
//
//    public static void main(String[] args) {
//        Z2 d = new Z2();
//        d.abc();
//        d.def();
//        d.ghi();
//    }
//
//    @Override
//    public void ghi() {
//        System.out.println("this is ghi override gde nuzno");
//    }
//}
