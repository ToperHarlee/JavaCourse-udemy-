package Lesson25Polimorphism;

class Car {
    static int a = 5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);//5
        c = null;
        System.out.println(c.a);//5 тк статик и проверяется ссылка на обьект
    }

    //Instance of -- является ли обьект обьектом определенного класса(родство)
}
