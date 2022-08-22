package Lesson23OverridingHidingFinal;
//override --> имя в саб классе такое же как и вродительском
//список аргументов в саб классе такой же как и вродительском классе
//return type в саб классе такой же как в родительском классе
//для примитивных типов данных должен быть один тип данных(int, byte итд)
// acces modifired должны бфть одинаковыми либо менее строгими
//метод в сабклассе должен быть nonstatic
public class Test3 {
    public static void main(String[] args) {
//        Employee1 e = new Employee1();
//        e.eat();
//        Teacher1 t = new Teacher1();
//        t.eat();
        Employee1 e = new Teacher1();
        e.eat();
    }
}

class Eda{}

class Fruits extends Eda {}

class Employee1{
    double salary = 100;
    String name = "defaultMike";
    int age;
    int experience;

    protected Eda eat() {
        System.out.println("eat Employee");
        Eda e = new Eda();
        return e;
    }

//    void eat() {
//        System.out.println("eat Employe");
//    }
    void slepp() {
        System.out.println("sleep");
    }
}

class Teacher1 extends Employee1 {
    public Eda eat() {
        System.out.println("eat Teacher");
//        Eda e = new Eda();
        Fruits f = new Fruits();//ковариантный return тк фрукты сабклсс
        return f;
    }
//    void eat() {
//        System.out.println("eat teacher");
//    }
    int howManyStuds;
    void teach() {
        System.out.println("teach");
    }
}

//----------------------------------------
class A {
    Employee1 objectCreation () {
        return new Employee1();
    }
}

class B extends A {
//    Teacher1 objectCreation () {
//        System.out.println("Ok");
//        return new Teacher1();
//    }
    H objectCreation () {
        System.out.println("Ok");
        return new H();
    }
}
//H тоже сабкласс Employee
class H extends Teacher1 {}