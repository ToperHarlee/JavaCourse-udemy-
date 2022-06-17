package Lesson10;
import Lesson9.*;//будут импортированы все классы Lesson9
//import Lesson9.Lesson9Car;
//import Lesson9.Student;
//import Lesson8.*;
//если при импорте совпадают имена классов то нужно указать поное имя
import java.lang.String;
import Homework.Lesson4HomeWork.*;//если нужно использовать package в package
import static Lesson9.Lesson9Car.ab;//импорт статичной переменной
import static Lesson9.Lesson9Car.*;//импорт всех переменных класса


public class Lesson10 {
   //import & import static

    //static int count = 99;

   public static void main(String[] args) {
       String st1 = new String("hello");
       Lesson9.Lesson9Car c1 = new Lesson9.Lesson9Car("red","v7");
       Lesson9Car c2 = new Lesson9Car("dark", "v8");
//       Lesson9.Student st1 = new Lesson9.Student();
       Student st2 = new Student();
       System.out.println(st2.z);
       System.out.println(Student.c);//нужно использовать имя класса если статичная переменная

       Lesson4HomeWorkStudentID Marfa  = new Lesson4HomeWorkStudentID();

       System.out.println(ab);
       System.out.println(count);//сначала проверяется наличие переменной в своем классе
   }
}


class B{
    Student st3 = new Student();

}