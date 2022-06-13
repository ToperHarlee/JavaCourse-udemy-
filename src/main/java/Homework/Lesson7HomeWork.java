package Homework;

import Lesson6.Lesson6Employee;

public class Lesson7HomeWork {
    //дефолтный конструктор(дефолтный если нет модификатора)
    Lesson7HomeWork(String surnameDefault) {
        surname = surnameDefault;
    }

    Lesson7HomeWork(int id2, String surname2, int age2) {
        //this вызов конструктора внутри конструктора, а какой компилятор определяет по параметрам
//        this(surname2, age2);
//        Employeeid = id2;
        this(id2, surname2, age2, 500.0, null);
    }
//private только внутри класса
    private Lesson7HomeWork (String surname3, int age3) {
//        surname = surname3;
//        age  = age3;
        this (6, surname3, age3, 800.0, "Ko6kin");

    }

     public Lesson7HomeWork(int id4, String surname4, int age4, double salary4, String department4) {
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

    public void showEmployersParams(int arg1){
        Employeeid = arg1;
        System.out.println("va6 id  " + arg1);
    }

    public void showEmployersParams(String arg2){
        surname = arg2;
        System.out.println("va6 surname  " + arg2);
    }

    public void showEmployersParams(double arg3){
        salary = arg3;
        System.out.println("va6a salary  " + arg3);
    }

    //как узнать значение переменной если она private -- обратится к ней через get

    public void getId (){
        System.out.println(Employeeid);
    }

    public void getSurname(){
        System.out.println(surname);
    }

    public void getSalary () {
        System.out.println(salary);
    }


    protected int Employeeid;//будет видна во всех классах этого пакета - 7
    public String surname;// будет виден везде
    int age;
    private double salary;//будет виден только в этом классе
    String department;


}



class EmployeeTest7{
    public static void main(String[] args) {
        Lesson7HomeWork emp1 = new Lesson7HomeWork(1, "Bakhtin", 35);
        System.out.println(emp1.surname);
//        Lesson7HomeWork emp2 = new Lesson7HomeWork("Bakhtin", 35);//будет ошибка тк приват
        Lesson7HomeWork emp3 = new Lesson7HomeWork(2, "Bakhtin", 35, 100.000, "it");
        Lesson7HomeWork emp4 = new Lesson7HomeWork("GGGGG");
        System.out.println(emp3.department);
    }
}

class EmployeeTest8{
    public static void main(String[] args) {
        Lesson7HomeWork emp5 = new Lesson7HomeWork("gggg");
        System.out.println(emp5);
//        Lesson7HomeWork emp6 = new Lesson7HomeWork("Bakhtin", 95);
//        System.out.println(emp6);//не напечатает тк private
          emp5.showEmployersParams(emp5.Employeeid);
          emp5.showEmployersParams(emp5.surname);
//          emp5.showEmployersParams(emp5.salary); не видна эта переменна тк стоит приват
        //но обратившись через гет можно ее вытащить
        emp5.getSalary();
        emp5.getId();
        emp5.getSurname();
    }
}
