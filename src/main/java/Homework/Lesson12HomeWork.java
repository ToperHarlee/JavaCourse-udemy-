package Homework;
import Lesson11.Student;

import  static Lesson11.Lesson11.*;


public class Lesson12HomeWork {

       //1
       //ЗАПОМНИ!!! В МЕТОД ПЕРЕДАЕМ ЗНАЧЕНИЯ(!!!) ОБЬЕКТА т.е. Student st2 --> st2 обьект и к нему мы уже можем повесить
       // значения(name, course etc)
       public static void checkNameSTuds(Student st1, Student st2) {
           if (st1.name.equals(st2.name)) {
               System.out.println("Имена студентов " + st1.name + st2.name + " совпадают");
               if (st1.name == st2.name) {
                   System.out.println("разные студенты " + "значение " + st1.name +
                           " не идентично по знакам и порядку знаков " + st2.name);
               }
           } else if (st1.course == st2.course || st1.grade == st2.grade) {
               System.out.println("Оценки и курс у студентов не различаются");
           } else if (st1.course != st2.course || st1.grade != st2.grade) {
               System.out.println("Оценки и курс у студентов разные");
           }
           else {
               System.out.println("таких студентов не существует");
           }
       }

       //2
       public static void checkStudsInfo (Student st1, Student st2) {
             checkNameSTuds(st1, st2);
             if (st1.course < st2.course || st1.course > st2.course) {
                System.out.println("студенты учатся на разных курсах" + st1.name + "на " + st1.course +
                        st2.name + "на" + st2.course);
                if (st1.course == st2.course ) {
                    System.out.println("Studenti" + st1.name + "&" + st2.name + "однокурсники");
                }
            }else {
                 System.out.println("нет информации о курсе на котором учатся " + st1.name +
                         st2.name);
             }
             if (st1.grade < st2.grade || st1.grade > st2.grade) {
                 System.out.println("оценки " + st1.name + "&" + st2.name + "разные");
                 if (st1.grade == st2.grade) {
                     System.out.println("оценки студентов " + st1.name + "&" + st2.name  + "совпадают");
                 } else if (st1.grade == 0.0 || st2.grade == 0.0){
                     System.out.println("Нет данных об успеваемости студентов " + st1.name + "&" + st2.name);
                 }
             } else {
                 System.out.println("обратитесь в деканат");
             }
       }




    public static void main(String[] args) {
        Student st1 = new Student("Divan", 3, 9.7);
        Student st2 = new Student("Knopa", 1, 4.7);

        checkNameSTuds(st1, st2);

        checkStudsInfo(st1, st2);
    }

}
