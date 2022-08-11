package Lesson22IncapsulationSuperProtection.p1;
import Lesson22IncapsulationSuperProtection.Chelovek;

public class Test1 {
    public static void main(String[] args) {
        Chelovek c = new Chelovek("male");
        c.setName(new StringBuilder("mike"));
        c.setAge(35);
        c.setWeight(80);
        System.out.println(c.getName());
        System.out.println(c.getAge());
        System.out.println(c.getWeight());
    }
}
