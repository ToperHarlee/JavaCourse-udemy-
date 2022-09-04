package Lesson24AbstractDefaultStaticMethods;

public class Test1 {
//    public final static void main(String[] args) {
////        System.out.println("privet");
//    }
}

class A {
    String s  = "privet";
    void abc() {
        System.out.println("&&&");
    }
}

class B extends A{
    String s  = "poka";
    void abc() {
        System.out.println("asdad");
    }
}

class C extends B {
    public static void main(String[] args) {
        C c = new C();
        c.abc();
        System.out.println(c.s);
    }
}
