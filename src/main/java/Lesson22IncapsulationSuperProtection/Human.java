package Lesson22IncapsulationSuperProtection;

public class Human {
//    public  Human (String n) {
//        name = n;
//    }
    //если  элемент private ео в другом классе они видны не будут тк. не наследуются но
    //наслудуются методы которые могут работать с ним
    //default видны только если child класс в том же пакете
    //protected видны в том же пакете что и родительский класс и в наследующих классах
    //вне зависимости от того в каком пакете он находится

     protected String name = "mike";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        protected static int salary = 150;
    protected static void work() {
        System.out.println("work");
    }
    protected static void chill() {
        System.out.println("chill");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.chill();
    }
}
