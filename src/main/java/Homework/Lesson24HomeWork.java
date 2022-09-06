package Homework;


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

