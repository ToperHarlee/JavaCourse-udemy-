public class Lesson5Car {

    Lesson5Car(String cvet, String motor) {
      color = cvet;
      engine = motor;
      //в теле конструктора можно прямо задавать значение переменных
//        color = "blue";
//        engine = "fcku";
        System.out.println("cvet ma6ini " + color + "motor " + engine);
    }
    //Конструктор не имеет return!!!!
    String color;
    String engine;

}

class CarTest {
    public static void main(String[] args) {

        Lesson5Car Car1 = new Lesson5Car("yellow", "v4");
//        System.out.println(Car1.color);
//        System.out.println(Car1.engine);

        Lesson5Car Car2 = new Lesson5Car("black", "v67");
//        System.out.println(Car2.color);
//        System.out.println(Car2.engine);
    }
}
