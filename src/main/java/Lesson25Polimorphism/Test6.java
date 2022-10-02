package Lesson25Polimorphism;

public class Test6 {

}

class Test10 {
    int a = 5;
    void abc () {
        System.out.println("ok");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc () {
        System.out.println("ok2");
    }
}

class Test30 extends Test20{
    void abc () {
        int a = 15;
        super.abc();
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        System.out.println(((Test10)t).a);
    }
}
