package Lesson21RepeatAndExamples;

public class Test3 {
    Test3() {
        System.out.println("eto konstruktor");
    }

    void Test3() {
        System.out.println("Eto metod");
    }

    Test3 Test3;
}

class A {
    public static void main(String[] args) {
        Test3 t = new Test3();

    }
}
