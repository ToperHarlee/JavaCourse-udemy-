package Lesson25Polimorphism;

public class Test4 {
    public static void main(String[] args) {
        _Help_able h = new _Doctor();
        _Employee emp1 = new _Doctor();
        _Employee emp2 = new _Teacher();
        _Employee emp3 = new _Driver();
        //casting - переменная одного типа данных ведет себя как переменная другого типа данных
        _Doctor d1 = (_Doctor) emp1;
        System.out.println(d1.specialization);
        System.out.println((((_Doctor) emp1).specialization));
        d1.heal();
        ((_Doctor) emp1).heal();
        ((_Doctor) emp2).heal();//exeption
        h.help();
        ((_Doctor)h).heal();

        _Employee emp = new _Doctor();
        ((_Doctor)emp).help();//вызов метода имплементированного доктором
        _Employee y = new _Employee();
        System.out.println(y == emp);
        Test3 t = new Test3();
        System.out.println(t.equals(emp));

        _Employee emp4 = new _Employee();
        _Employee[] arr = {emp1, emp2, emp3, emp4};
        for (_Employee a:arr) {
            if (a instanceof _Driver) {
                System.out.println(((_Driver) a).carName);
               ((_Driver) a).drive();
            }
        }
    }
}

class _Employee{
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

class _Doctor extends _Employee implements _Help_able{
    String specialization = "surgery";

    @Override
    public void help() {
        System.out.println("Doctor okazivaet pomo6");
    }

    void heal() {
        System.out.println("heal");
    }
}


class _Teacher extends _Employee {
    int howManyStudsHave;
    void teach() {
        System.out.println("teach");
    }
}

class _Driver extends _Employee {
    String carName = "bmw";
    void drive() {
        System.out.println("drive");
    }
}

interface _Help_able {
    void help();
}