package Homework;

public class Lesson22Animal {
    Lesson22Animal(int eyes) {
        this.eyes = eyes;
        System.out.println("i amn Animal");
    }
    public static int eyes;
    public void eat () {
        System.out.println("Animal eats");
    }
    public void drink () {
        System.out.println("Animal drink");
    }
}

class Pet extends Lesson22Animal {
    Pet(String name, int eyes) {
        super(eyes);
        System.out.println("I am pet");
        Pet.eyes = 2;
        this.name = name;
    }


    String name;
    int tail = 1;
    int paw = 4;


    public void run () {
        System.out.println("pet runs");
    }
    public void  jump () {
        System.out.println("pet jumps");
    }
}

class Dog extends Pet {
    Dog(String name, int eyes) {
        super(name, eyes);
//        this.name = name;
        System.out.println("I am Dog and my name is: " + name);
    }

    public void play () {
        System.out.println("dog plays");
    }
}

class Cat extends Pet {
    Cat(String name, int eyes) {
        super(name, eyes);
        System.out.println(" i am cat and my name is" + name);
    }

    public void sleep () {
        System.out.println("Cat sleeps");
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Basya", 2);
        System.out.println(dog.paw);
        Cat knopa = new Cat("Knopa", 2);
        knopa.sleep();
    }
}