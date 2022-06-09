package Lesson7_1;

import Lesson7.Employee;

public interface ThirdClass {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}
