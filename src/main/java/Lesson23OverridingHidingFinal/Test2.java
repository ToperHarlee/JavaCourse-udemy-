package Lesson23OverridingHidingFinal;


public class Test2 {
    //в java все обьект
    public  Object abc () {
//        return new StringBuilder("adasd");
        return new int[]{2,5,6};
    }
    public Doctor abc2 () {
        return new Surgery();
    }
    public static void main(String[] args) {
//        Doctor d = new Doctor();
//        Teacher t = new Teacher();
//        Driver dr = new Driver();
//        Employee e = new Employee();
        //перем employee может ссылатся на обьект сабкласса

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary + " " + emp1.name + " " + emp1.age + " " +
                emp1.experience);
        emp1.eat();
        emp1.slepp();
//        emp1.heal();

        Employee emp2 = new Teacher();

        Employee emp3 = new Driver();

        Surgery x = new Surgery();

        Doctor d2 = new Surgery();
        System.out.println(d2.age + " " + d2.name + " " + d2.age + " " + d2.experience
        + " " + d2.salary);
//        System.out.println(d2.scalpel);
//        d2.operacia();
        d2.eat();
        d2.slepp();
        d2.heal();

        Employee emp4 = new Surgery();
        emp4.eat();
        emp4.slepp();
        System.out.println(emp4.age + " " + emp4.name + " " + emp4.age + " " + emp4.experience
                + " " + emp4.salary);
//        emp4.operaсia(); // нельзя тк employe не обладает этими методами хоть и ссылается на хирурга
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

class Doctor extends Employee {
    void heal() {
        System.out.println("heal");
    }
}

class Surgery extends Doctor {
    String scalpel;
    void operacia() {

    }
}


class Teacher extends Employee {
    int howManyStuds;
    void teach() {
        System.out.println("teach");
    }
}

class Driver extends Employee {

    void drive() {
        System.out.println("drive");
    }
}
