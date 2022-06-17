package Lesson9;

public class Lesson9Car {

    final int X = 3;
    int g = 5;//название можеть быть сколь угодно длинным
    int $ZDF = 10;
    //boolean int = 2; -- так нельзя int зарезервирован etc
    int String = 2;


    String color;//instance переменные и внутри класса и внутри методов
    public static int ab = 10;
    String engine;
    static public int count;//статик переменная принадлежит всему классу

    public static void changeA (int b){
        Lesson9Car c = new Lesson9Car("black", "V8");
        c.ab = b;//изменение переменной обьекта как обращение к методу обьекта и присвоение к аргументу другого метода
        //а будет изменятся только в этом методе для обьекта с
    }


    //this  указывает на текущий обьект класса
    //this НЕЛЬЗЯ использовать внутри static метода!!!!!!
    public  Lesson9Car (String color, String engine) {

        int a = 5;
        int y = a + 10;
        this.count++;
        this.color = color;//this.color - принадлежит обьекту
        this.engine = engine;//engine - параметр
    }



//    public void showColor(){
//        System.out.println("Cvet ma6ini  " + color);
//        changeColor("red");
//    }
//
//    public void changeColor (String color3) {
//        System.out.println("cvet car change");
//        int cena = 1000;//локальная переменная только в методе
//        color = color3;
//        cena += 1000;
//    }

    void  changeCOlor (String color) {
        System.out.println(color);
    }

    public static void main(String[] args) {
        Lesson9Car c = new Lesson9Car("red", "v4");
        System.out.println(c.color);
        c.changeCOlor("black");
        System.out.println(c.color);//red
    }

}
