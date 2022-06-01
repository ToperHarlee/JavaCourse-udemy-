public class Lesson5 {
    //метод = функция
    //конструктор всегда называется также как и класс
    int summa (int a,int b,int c) {
        int result = a + b + c;
        return result;
    }

    //--------------------------SrednArifm----------------------------
    int SredneArifm(int arg1, int arg2, int arg3) {
        int result =   summa(arg1, arg2, arg3) / 3;
        return result;
    }

    //--------------------------------------------------Car
    String color;
    String engine;
    int speed;

    int gaz (int skorost){
        speed = speed + skorost;
        return  speed;
    }

    int tormoz (int skorost){
        speed = speed - skorost;
        return  speed;
    }

    //если ненужен return --> void
    void showInfo () {
        System.out.println("color " + color + " engine " + engine + "speed  " + speed);
    }



}

class TestLesson5 {
    public static void main(String[] args) {
        Lesson5 summaTrex = new Lesson5();
        int STrex = summaTrex.summa(3,4,5);
        System.out.println(STrex);

        //----------------------SredneArifm-----------------------------
        System.out.println(summaTrex.SredneArifm(20, 40, 60));



        //---------------------------------------------------------Car
        Lesson5 Car1 = new Lesson5();
        Car1.color = "red";
        Car1.engine = "v6";
        Car1.speed = 90;
        Car1.showInfo();
        Car1.gaz(20);
        Car1.showInfo();
        Car1.tormoz(30);
        Car1.showInfo();

    }
}