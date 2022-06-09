package Lesson7;

public class Employee {
    //public - виден во всех классах пакетов
    //private элемент класса А виден только в нем
    //default - виден во всех классах одного пакета в котором расположен сам класс
    //protected - элемент класса А видег во всех классах одного пакета
    // в котором располож сам класс + во всех классах --> его потомках
     protected double salary;

    void dvoynayaZP() {
        double result = salary * 2;
        System.out.println("Novaya ZP " + result);
    }

    Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}