public class Lesson6Employee {
//overloaded constructors
    Lesson6Employee(int id2, String surname2, int age2) {
        //this вызов конструктора внутри конструктора, а какой компилятор определяет по параметрам
//        this(surname2, age2);
//        Employeeid = id2;
        this(id2, surname2, age2, 0.0, null);
    }

    Lesson6Employee (String surname3, int age3) {
//        surname = surname3;
//        age  = age3;
        this (0, surname3, age3, 0.0, null);

    }

    Lesson6Employee(int id4, String surname4, int age4,double salary4, String department4) {
        //this должен идти первым внутри конструктора
//        this(id4,surname4, age4);
//        salary = salary4;
//        department = department4;
        Employeeid = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int Employeeid;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest{
    public static void main(String[] args) {
        Lesson6Employee emp1 = new Lesson6Employee(1, "Bakhtin", 35);
        System.out.println(emp1.surname);
        Lesson6Employee emp2 = new Lesson6Employee("Bakhtin", 35);//компилятор определяет какой конструктор по заданным параметрам
        Lesson6Employee emp3 = new Lesson6Employee(2, "Bakhtin", 35, 100.000, "it");
        System.out.println(emp3.department);
    }
}
