package Lesson24AbstractDefaultStaticMethods;

public class Test3Interface {
}

class Employee{
    double salary = 100;
    String name = "defaultMike";
    int age;
    int experience;
    void eat() {
        System.out.println("eat");
    }
    void slepp() {
        System.out.println("sleep");
    }
}


 class Teacher extends Employee implements Help_able{
    int howManyStudsHave;
    void teach() {
        System.out.println("teach");
    }
    public void firstAid () {
        System.out.println("teacher make first aid");
    }
    public void tushitPozar() {
        System.out.println("teacher tushit pozar");
    };
}

class Driver extends Employee implements Help_able, Swim_able{
    String carName;
    void drive() {
        System.out.println("drive");
    }
    public void firstAid () {
        System.out.println("driver make first aid");
        System.out.println(a);
    }
    public void tushitPozar() {
        System.out.println("driver tushit pozar");
    };

    public void swim() {
        System.out.println("driver can swim");
    };
}
//interface может содержать ТОЛЬКО абстрактные методы
interface Help_able {
   public abstract void firstAid();
    void tushitPozar();
    public final static int a = 10;
}
//interface может содержать ТОЛЬКО константы
interface Swim_able {
    void swim();
}