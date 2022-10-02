package Lesson25Polimorphism;

public class Test1 {
    /*Полиморфизм - способность обьекта принимать несколько форм
    полиморфизм - способность метода вести себя по разному в зависимости обьект
    какого класса вызывает метод
    - перезаписаные методы называют полиморфными
     */
    public static void main(String[] args) {
        Driver [] array1 = {new Driver(), new Driver()};
        Employee [] array2 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Help_able [] array3 = {new Driver(), new Driver(), new Teacher(), new Doctor()};
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee [] array4 = {emp1, emp2, emp3};
        for (Employee emp: array4) {
            emp.work();//три раза вызовет метод  в трех разных обьектах
        }

//        Help_able h = new Teacher();
//        emp1.help();
        emp1.work();
        emp2.work();
        emp3.work();
        //три раза метод будет работать по разному

        //Instance Of

        System.out.println(emp1 instanceof Employee);//true
        System.out.println(emp1 instanceof Driver); //false
        System.out.println(null instanceof String);//false
    }
}

abstract class Employee {
    void sleep () {
        System.out.println("Employee sleeps");
    }
    abstract void work();
}

class Teacher extends Employee implements Help_able{
    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
    @Override
    void work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able{
    @Override
    void work() {
        System.out.println("Driver works");
    }
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee implements Help_able{

    public void help() {
        System.out.println("Doctror helps");
    }
    @Override
    void work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}
