package Homework;

import Lesson11.Lesson11;

public class Lesson11Homework {
    //1
    public String color;
    public String engine;
    public static int doors;

    Lesson11Homework (String color, String engine, int doors) {
        this.color = color;
        this.engine = engine;
        this.doors = doors;
    }
}

class CarTest {
    //1
    //public static void changeDoors ( int arg1) {
    public static void changeDoors (Lesson11Homework obj, int arg1) {
         //v1
        obj.doors = arg1;
        //v2

    }

    //2
    public static void changeColors (Lesson11Homework color1, Lesson11Homework color2) {
    //public static void changeColors (Lesson11Homework color1, Lesson11Homework color2, String chooseColor1, String chooseColor2) {
        //v1
//              color1.color = "black";
//              color2.color = "blue";
        //v2 переприсваиваю параметр создающегося обьекта
        String color3 = color1.color;
        color1.color = color2.color;
        color2.color = color3;

        //v3 брать значение color из аргумента метода
//        color1.color = chooseColor1;
//        color2.color = chooseColor2;
    }


    public static void main(String[] args) {
        Lesson11Homework car1 = new Lesson11Homework("red", "v4", 7);
        changeDoors(car1,2);
        System.out.println(car1.doors);

        //2
        Lesson11Homework car2 = new Lesson11Homework("blue", "v5", 9);
        Lesson11Homework car3 = new Lesson11Homework("black", "v7", 10);
        //changeColors(car2,car3, "black", "blue");
        changeColors(car2,car3);
        System.out.println(car2.color);
        System.out.println(car3.color);
        changeDoors(car2,3);
        System.out.println(car2.doors);
    }



}