package Lesson13;

public class Employee {
    public static void main(String[] args) {
        final int denNedeli = 1;
        final  int a = 1;
        final int b = 2;

        switch (denNedeli * 3) {
            case 1: System.out.println("Работа до 18.00");
            break;
            case -2: System.out.println("Работа до 18.00");
            break;
            case a * b: System.out.println("Работа до 18.00");
            break;
            case 4: System.out.println("Работа до 18.00");
            break;
            case 5: System.out.println("Работа до 15.00");
            break;
            case 6: System.out.println("не работаем");
            break;
            case 7: System.out.println("отдыхаем");
            break;
            default: System.out.println("error404");
        }
        //switch --> byte, short, int , char , STring <----- !!!!!


    }
}
