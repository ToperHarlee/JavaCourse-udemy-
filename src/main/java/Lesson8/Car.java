package Lesson8;

public class Car {
    String color = "blue";
    String engine = "V6";

}

class Humean{
    String name = "Mike";
   final Car c = new Car();

    public static void main(String[] args) {
        Humean h1 = new Humean();
//        h1.c = new Car();
//        h1.c = new Car();
        h1.c.engine = "v12";
    }
}
