package Lesson22IncapsulationSuperProtection;

public class Test4 {
    //конструкторы не наследуют

}

 class AnotherHuman {
     AnotherHuman(String name, String surname) {
       this.name = name;
       this.surname = surname;
    }
//    AnotherHuman(String n) {
//        this(n, null);
//    }
//
//    AnotherHuman(String n, String s) {
//        name = n;
//        surname = s;
//    }
    String name;
    String surname;
}

class AnotherStudent extends AnotherHuman {
    //super - обращение к предку
    int course;
    AnotherStudent(String name, String surname, int course) {
        //this(5);
        //System.out.println("Hello");
        super(name, surname);
        this.course = course;
    }

//    AnotherStudent(int i) {
//        super("as");
//    }
    public static void main(String[] args) {
        AnotherStudent a = new AnotherStudent("oj","asd", 3);
        System.out.println(a.name + a.surname + a.course);
    }
}