package Homework;

public class Lesson7HomeWorkSecond {

        public static void main(String[] args) {
            Lesson7HomeWork emp7 = new Lesson7HomeWork(1, "Bakhtin", 35);
            System.out.println(emp7.surname);
//            Lesson7HomeWork emp8 = new Lesson7HomeWork("Bakhtin", 35);//будет ошибка тк приват
            Lesson7HomeWork emp9 = new Lesson7HomeWork(2, "Bakhtin", 35, 100.000, "it");
            Lesson7HomeWork emp10 = new Lesson7HomeWork();
            System.out.println(emp9.department);
        }

}
