package Lesson16;

public class Car {
    String color;
    String engine;
    Car (String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final  static int a = 5;

//    public static void main(String[] args) {
//        a = 10;
//    }

    public Car abc (String color) {
        Car c10 = new Car(color, "v4");
        return  c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "v8");
        Car c2 = c.abc("black");//c никак не изменится просто создастся новый класс c2
        System.out.println(c.color);
    }
}

//Массив - коллекция элементов (int или string или char)
//массив - это ОБЬЕКТ

//private Arr value = {"p", "r", "i", "v", "e", "t"}

//String хранит свое значение в private массиве и массив имеет фиксированную длинну

//string хранит свое значение в final массиве его инициализация может быть только один раз

//ни один из методов класа string не меняет элементы массива типа char

//class TestCar {
//    final static Car c = new Car("red", "v8");
//
//    public static void main(String[] args) {
////        c = new Car("blue", "v10");
//        c.color = "black";
//    }
//}
