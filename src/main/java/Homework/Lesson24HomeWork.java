package Homework;

class Lesson24HomeWork {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("kesha");
        m.eat();
        m.swim();
        m.sleep();
        System.out.println(m.name);

        Speakable p = new Pingvin("jim");
        p.speak();

        Animal a = new Lev("bonifacii");
        a.eat();
        a.sleep();

        Mammal l = new Lev("kit");
        l.eat();
        l.run();
        l.sleep();
        l.speak();
    }
}
abstract class Animal {
    Animal(String name) {
        this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }
    String name;
    public void sleep() {
        System.out.println("Vsegfa interesno nabludat kak sleep fish");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable{

    Bird(String name) {
        super(name);
        this.name = name;
    }
    String name;

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
}

abstract class Mammal extends Animal implements Speakable{

    Mammal(String name) {
        super(name);
        this.name = name;
    }
    String name;
    abstract void run ();
}

interface Speakable {
    default void speak() {
        System.out.println("somebody speak");
    }
}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }
    String name;

    @Override
    void swim() {
        System.out.println("Me4enosec krasivaya riba, kotoraya bistro plavaet");
    }

    @Override
    void eat() {
        System.out.println("Me4enosec ne xishnaya riba, i ona est tipycal fish corm!");
    }
}

class Pingvin extends Bird {

    Pingvin(String name) {
        super(name);
        this.name = name;
    }
    String name;
    @Override
    void eat() {
        System.out.println("Pingvin Lubit est ribu");
    }

    @Override
    void sleep() {
        System.out.println("pingvini spat prizavshis k drug drugu");
    }

    @Override
    void fly() {
        System.out.println("pingvini ne umeut letat");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne umeut pet kak solovyi");
    }
}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
        this.name = name;
    }
    String name;
    @Override
    void eat() {
        System.out.println("Lev kak luboy hisnik lubit myaso");
    }

    @Override
    void sleep() {
        System.out.println("Bolshuyu chast dna lev spit");
    }

    @Override
    void run() {
        System.out.println("lev eto ne samaya bistraya koshka");
    }
}

