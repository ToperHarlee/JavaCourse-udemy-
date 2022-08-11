package Lesson22IncapsulationSuperProtection;
//наследование
public class Test3 {

    public void uvelichitZp(Employee zp) {
          zp.salary = zp.salary + 100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        //doc.specialization = "Surgery";
        doc.eat();
        doc.slepp();
        doc.heal();
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

class Doctor extends Employee{
//    String name;
//    int age;
//    int experience;
    //String specialization;
//    void eat() {
//        System.out.println("eat");
//    }
//    void slepp() {
//        System.out.println("sleep");
//    }
    void heal() {
        System.out.println("heal");
    }
}

class Surgery extends Doctor{
    String scalpel;
    String specialization = "surgery";
    void operacia() {

    }
}

class Dantist extends Doctor{
    String sverlo;
    String specialization = "zubi";
    void sverluZub() {

    }
}

class Teacher extends Employee{
//    String name;
//    int age;
//    int experience;
    int howManyStudsHave;
//    void eat() {
//        System.out.println("eat");
//    }
//    void slepp() {
//        System.out.println("sleep");
//    }
    void teach() {
        System.out.println("teach");
    }
}

class Driver extends Employee{
//    String name;
//    int age;
//    int experience;
    String carName;
//    void eat() {
//        System.out.println("eat");
//    }
//    void slepp() {
//        System.out.println("sleep");
//    }
    void drive() {
        System.out.println("drive");
    }
}