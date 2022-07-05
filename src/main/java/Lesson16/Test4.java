package Lesson16;

public class Test4 {
}

class Employee {
    double salary;
    boolean isManager;
    Employee(double salary, boolean isManager){
        this.isManager = isManager;
        this.salary = salary;
    }
}

class Testemploye {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        System.out.println("manager" + emp.isManager + "zp" + emp.salary);//нельзя сложить bool и double
    }
}