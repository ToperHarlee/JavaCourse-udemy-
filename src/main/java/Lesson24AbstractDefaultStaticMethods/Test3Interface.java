package Lesson24AbstractDefaultStaticMethods;

public class Test3Interface {
    public static void main(String[] args) {
//        Help_able h = new Help_able(); -- нельзя создать обьект интерфейса
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.firstAid();
        h.tushitPozar("voda");
        s.swim();
        e.eat();
        e.slepp();
    }
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

class Driver extends Employee implements Help_able, Swim_able{
    String carName;
    void drive() {
        System.out.println("drive");
    }
    public void firstAid () {
        System.out.println("driver make first aid");
        System.out.println(a);
    }
    public void tushitPozar(String s) {
        System.out.println("driver tushit pozar s pomoshu  " + s);
    };

    public void swim() {
        System.out.println("driver can swim");
    };
}

 class Teacher extends Employee implements Help_able{
    int howManyStudsHave;
    void teach() {
        System.out.println("teach");
    }
    public void firstAid () {
        System.out.println("teacher make first aid");
    }
    public void tushitPozar(String s) {
        System.out.println("teacher tushit pozar s pomoshu " + s);
    };
}


//interface может содержать ТОЛЬКО абстрактные методы
//у интерфейса нет конструкторов
//acces modifired или public или default
//interface не может быть final
interface Help_able {
   public abstract void firstAid();
    void tushitPozar(String predmet);
    public final static int a = 10;
}
//interface может содержать ТОЛЬКО константы
interface Swim_able {
    void swim();
}
//если класс который не имплементировал интерфейс не перезаписал все его методы то
//этот класс должен обьявлятся abstract
abstract class Y implements Swim_able {
}
abstract class X extends Y {
}
class Z extends Y {
    @Override
    public void swim() {
    }
}