package Lesson5;

public class Lesson5Human {
   String name;
   Car3 car;
   BankAount bankchet;

   void info() {
       System.out.println("imya" + name + " cvet mashini" +  car.color + "balance s4eta  " +
               bankchet.balance);
   }
}

class HumanTest{
    public static void main(String[] args) {
        Lesson5Human h = new Lesson5Human();
        h.name = "mike";
        h.car = new Car3("red", "v8");
        h.bankchet = new BankAount(13, 100);
        h.info();
    }
}

class Car3{
    Car3(String cvet, String motor) {
        color = cvet;
        engine = motor;
    }
    String color;
    String engine;
}

class BankAount {
    BankAount(int id2, double money) {
        id = id2;
        balance = money;
    }

    int id;
    double balance;

}
