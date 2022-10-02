package Lesson25Polimorphism;

public class Test9 {

}

class Test_1 implements interface1, interface2{
    @Override
    public void abc() {
        System.out.println("OK");
    }

    public static void main(String[] args) {
        Test_1 t = new Test_1();
        System.out.println(((interface1)t).a);
        ((interface1)t).abc();
        t.abc();
    }
}

interface interface1 {
    int a = 5;
    void abc();
}

interface interface2 {
    int a = 10;
    void abc();
}
