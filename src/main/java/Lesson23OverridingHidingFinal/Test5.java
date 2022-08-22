package Lesson23OverridingHidingFinal;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp = new Employee2();
        Teacher2 t = new Teacher2();
//        emp.sleep();
//        t.slepp();
        Employee2 e = new Teacher2();
//        e.sleep(); //sleep y Employe private и не наследуется
        e.slepp(); // hiding - перекрытые статик метод из родительского класса в сабклассе
        /*hidding : --имя в sub такое же как в parent
                    -- список аргументов в sub такоей же как в parent
                    -- return type в sub такоей же как в parent или
                    return type в sub --> это sub  класс return type из parent
         */
        //final метод не может быть override или hidden
        //final класс не имеет потомков
        System.out.println(t.salary);//200
    }
}

class Eda1{}

class Fruits1 extends Eda1 {}
class Employee2{
    double salary = 100;
    String name = "defaultMike";

    protected Eda1 eat() {
        System.out.println("eat Employee");
        Eda1 e1 = new Eda1();
        return e1;
    }
//   private void slepp() {
//        System.out.println("sleep Employee");
//    }
    static void slepp() {
    System.out.println("sleep Employee");
}
}

class Teacher2 extends Employee2 {
    String salary = "dvesti";
    @Override
    public Eda1 eat() {
        System.out.println("eat Teacher");
        Fruits1 f1 = new Fruits1();//ковариантный return тк фрукты сабклсс
        return f1;
    }

    int howManyStuds;
    void teach() {
        System.out.println("teach");
    }
    static void slepp() {
        System.out.println("sleep Teacher");
    }
}

final class T{
}

//class P extends T {} уже нельзя тк T final
