package Lesson11;
//аргументы методов

public class Lesson11 {
    //primitive data types

    public String name;
    public double salary;

    Lesson11 (String name, double salary) {
         this.name = name;
         this.salary = salary;
    }

    //когда подставляем примитивны тип данных в параметр метода мы подставляем его ЗНАЧЕНИЕ
    public double uvelichitel (double a) {
        a = a *2;
        return a;
    }
    // тут  мы увеличим саму переменную
    public double zp2 () {
        salary = salary * 2;
        return salary;
    }

}


class EmployeeTest {
    public static void main(String[] args) {
        Lesson11 emp1 = new Lesson11("Mike", 130.55);
        double res = emp1.uvelichitel(emp1.salary);
        System.out.println(res);
        System.out.println(emp1.salary);
        emp1.zp2();
        System.out.println(emp1.salary);//изменилась сама переменная
    }
}