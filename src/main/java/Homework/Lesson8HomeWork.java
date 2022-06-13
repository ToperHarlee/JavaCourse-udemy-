package Homework;

import Lesson8.Lesson8;

public class Lesson8HomeWork {
    //1.
     public static int umnozenie (int arg1, int arg2 , int arg3){
        int result = (arg1 * arg2) * arg3;
        System.out.println(result);
        return  result;

    }

    public static void delenie ( double arg1, double arg2) {
        double resDel  = arg1 / arg2;
        double resOstatok = arg1 % arg2;
        System.out.println(resDel + " ostatok  " + resOstatok) ;
    }

   //2.
     static final double Pi = 3.14;

     public void PloshadKruga (double radius){
         double S = Pi * radius * radius;
         System.out.println("Plo6ad kruga = " + S);
     }

     public static double DlinnaOkr (double radius) {
         double S = 2 * Pi * radius;
         System.out.println("dlinna okruznosti = " + S);
         return S;
     }

     public void showParams (double radius) {
         System.out.println("kurrent radius = " + radius);
         DlinnaOkr(radius);
         PloshadKruga(radius);
     }



}

class DoWork {

    public static void main(String[] args) {
        //1
        delenie(6,3);
        delenie(15,4);

        umnozenie(2,2,2);
        umnozenie(3,3,3);

        //2
        radius(5);
        radius(6);

        Lesson8HomeWork.DlinnaOkr(7);
        Lesson8HomeWork.DlinnaOkr(9);

        showParams(5);
        showParams(10);
    }
   //HW 1.определил статический метод в другом классе и через него вызвал метод из LEsson8HomeWork
    private static void delenie(double arg1, double arg2) {
      Lesson8HomeWork.delenie(arg1,arg2);
    }

    static void umnozenie(int arg1, int arg2, int arg3) {
        Lesson8HomeWork.umnozenie(arg1,arg2,arg3);
    }

    //2. так же определю тут статичные методы и через них буду вызывать радиус площидь и длинну
    public static void radius(double radius){
         Lesson8HomeWork p = new Lesson8HomeWork();
         p.PloshadKruga(radius);
    }

    public static void showParams (double radius) {
        Lesson8HomeWork p = new Lesson8HomeWork();
        p.showParams(radius);
    }


}