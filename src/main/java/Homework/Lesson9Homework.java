package Homework;

public class Lesson9Homework {


    public static void createObject (){
        //метод создаем 2 обьекта только внутри себя после вызова они исезнут
        Lesson9Homework p = new Lesson9Homework();
        Lesson9Homework v = new Lesson9Homework();
        System.out.println("create 2 obj");
    }




    public static void main(String[] args) {
        //1.хотел удалять обьекты через метод но хз как компилятор ругается
        Lesson9Homework method1 = new Lesson9Homework();
        Lesson9Homework method2 = new Lesson9Homework();
        Lesson9Homework method3 = new Lesson9Homework();
        Lesson9Homework method4 = new Lesson9Homework();
        Lesson9Homework method5 = new Lesson9Homework();
        Lesson9Homework method6 = new Lesson9Homework();
        Lesson9Homework method7 = new Lesson9Homework();
        Lesson9Homework method8 = new Lesson9Homework();
        method1 = null; method2 = null; method3 = null; method4 = null; method5 = null; method6 = null;//осталось 2 обьекта
        System.gc();
        //1.2
        Lesson9Homework i = new Lesson9Homework();
        createObject();//обьекты тут будут созданы и после вызова исчезнут тк они только в методе
        createObject();
        Lesson9Homework k = new Lesson9Homework();
        createObject();
        System.gc();


    }
}
//2.
class Test1 {
    int a = 1;
    static int b = 2;
    void abc (int a){
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.abc(3);
    }
}

class Test2 {
    int a = 1;
    static  int b = 2;
    static void abc (final int a){
        System.out.println(a);
        System.out.println(Test2.b);
    }

    public static void main(String[] args) {
        abc(5);
    }
}

class Test3 {
    int a = 1;
    static int b = 2;
    void abc (int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Test3.b);
    }

    public static void main(String[] args) {
        Test3 t = new Test3();
        t.abc(4);
    }
}