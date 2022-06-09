package Lesson4;

public class BankAkkLEsson4 {
    int id;
    String name = "Mike";
    //String name = new String("Mike");
    double balance;


//    public static void main(String[] args) {
//        Lesson4.BankAkkLEsson4 MyAkk = new Lesson4.BankAkkLEsson4();
//        Lesson4.BankAkkLEsson4 YourAkk = new Lesson4.BankAkkLEsson4();
//        Lesson4.BankAkkLEsson4 HerAkk = new Lesson4.BankAkkLEsson4();
//
//        MyAkk.id = 1;
//        MyAkk.name = "Mike";
//        MyAkk.balance = 100;
//
//        YourAkk.id = 2;
//        YourAkk.name = "Knopa";
//        YourAkk.balance = 700;
//
//        HerAkk.id = 3;
//        HerAkk.name = "Vera";
//        HerAkk.balance = 900;
//
//        System.out.println(MyAkk.id);
//        System.out.println(MyAkk.name);
//        System.out.println(MyAkk.balance);
//
//    }
    //----Car----------------
    BankAkkLEsson4(){}//дефолтный конструктор

    String color ;
    String engine ;
}

class BankAkkTest {
    public static void main(String[] args) {
        BankAkkLEsson4 MyAkk = new BankAkkLEsson4();
        BankAkkLEsson4 YourAkk = new BankAkkLEsson4();
        BankAkkLEsson4 HerAkk = new BankAkkLEsson4();

        MyAkk.id = 1;
        MyAkk.name = "Mike";
        MyAkk.balance = 100;

        YourAkk.id = 2;
        YourAkk.name = "Knopa";
        YourAkk.balance = 700;

        HerAkk.id = 3;
        HerAkk.name = "Vera";
        HerAkk.balance = 900;

        System.out.println(MyAkk.id);
        System.out.println(MyAkk.name);
        System.out.println(MyAkk.balance);

    }
}

class CarTEst {
    public static void main(String[] args) {
        BankAkkLEsson4 NewMachine1 = new BankAkkLEsson4();
        NewMachine1.color = "black";
        NewMachine1.engine = "V8";
        System.out.println("-------");
        System.out.println("cvet machini:  " + NewMachine1.color);
        System.out.println("motor  " + NewMachine1.engine);

        BankAkkLEsson4 NewMachine2 = new BankAkkLEsson4();
        BankAkkLEsson4 NewMachine3 = NewMachine2;
        BankAkkLEsson4 NewMachine4;
        System.out.println(NewMachine3.engine);//v6
        System.out.println(new BankAkkLEsson4().color);
    }
}
