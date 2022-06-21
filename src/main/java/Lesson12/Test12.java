package Lesson12;

public class Test12 {

    void maximum (int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3){
            int a = 5;
            System.out.println("Maximum" + i1);
        } else  if (i2 > i1 && i2 > i3) {
            int a = 15;
            System.out.println("Maximum "+ i2);
        } else {
            int a = 16;
            System.out.println("maximum" + i3);
        }
    }

    void  abc () {
        String str;
        int a = 10;
        if (a >= 10){
            System.out.println("priv");
        }
        if (a < 10){
            str = "poka";
        } else {
            str = "asdasda";//локальные переменные нужно назначать в else чтобы не было ошибки компилояции
        }
        System.out.println(str);
    }


    public static void main(String[] args) {
        int salary = 600;
        int minSalary = 400;

        if (salary>= 500) {
            System.out.println(":))");
        } else  {
            System.out.println(":(((");
        }

        if (minSalary>=500);//все что боез скобок 1е выражение относится к if остальное нет
        System.out.println("hello");

        int salary3 = 500;
        boolean b = true;
        //== --> сравнение адреса (у обьектов например двух разных == будет false)
        //equals --> метод сравнения(например у String чравнивает колво букв и их порядок)
        if (salary3 < 200) {
            System.out.println("zp otstoy");
        } else if (salary3 < 400 && b == false || !true) {
            System.out.println("zp tak sebe");
        } else if (salary3 < 600){
            System.out.println("zp norm");
        } else if (b == true) {
            System.out.println("piepoepie");
        }
        else {
            System.out.println("zp ogon!");
        }

        Test12 t = new Test12();
        t.maximum(4,6,0);

        int a = 10;
        int b2 = 20;
        int max = (a > b2) ? a : b2;//тернарный оператор
        System.out.println(max);
        //(boolean expression) ? (if true) : (if false);
    }
}
