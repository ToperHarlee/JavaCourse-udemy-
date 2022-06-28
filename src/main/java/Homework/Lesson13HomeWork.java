package Homework;

public class Lesson13HomeWork {
    public int month;

    public static void setMonth (int bindMonth) {
        System.out.println("Calendar for 2015 year");
        System.out.println("----------------------");
        switch (bindMonth) {
            case 1 : System.out.println("January 01, days -- 31"); break;
            case 2 : System.out.println("February 02, days -- 28"); break;
            case 3 : System.out.println("Mart 03, days -- 31"); break;
            case 4 : System.out.println("April 04, days -- 30"); break;
            case 5 : System.out.println("May 05, days -- 31"); break;
            case 6 : System.out.println("June 06, days -- 30"); break;
            case 7 : System.out.println("July 07, days -- 31"); break;
            case 8 : System.out.println("August 08, days -- 31"); break;
            case 9 : System.out.println("September 09, days -- 30"); break;
            case 10 : System.out.println("October 10, days -- 31"); break;
            case 11 : System.out.println("November 11, days -- 30"); break;
            case 12 : System.out.println("December 12, days -- 31"); break;
            default: System.out.println("Вводите числа от 1 до 12");
        }
    }

}

class Test13 {
    public static void main(String[] args) {
        Lesson13HomeWork.setMonth(4);
        Lesson13HomeWork p = new Lesson13HomeWork();
        p.setMonth(3);
    }
}