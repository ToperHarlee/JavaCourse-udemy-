package Lesson22IncapsulationSuperProtection.p1;

import Lesson22IncapsulationSuperProtection.Human;
import Lesson22IncapsulationSuperProtection.*;

public class Student  extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.chill();

        Human h = new Human();
        System.out.println(Human.salary);
        Human.chill();
    }
}

class Test {
    public static void main(String[] args) {
//        Human h = new Human();
//        System.out.println(h.name);
//        h.work();
        Student s = new Student();
        //класс тест не наследует от human поэтому не видны методы
//        System.out.println(s.name);
//        System.out.println(Student.salary);
//        s.work();
//        Student.chill();
    }
}
