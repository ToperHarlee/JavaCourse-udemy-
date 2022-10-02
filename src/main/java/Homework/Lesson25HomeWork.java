package Homework;

class Lesson25HomeWork {
    public static void main(String[] args) {
        _Animal a1 = new _Lev("Piu");
        _Animal a2 = new _Pingvin("asd");

        _Mechenosec m = new _Mechenosec("kesha");
        System.out.println(m.name);

        _Speakable p = new _Pingvin("jim");

        _Animal a = new _Lev("bonifacii");

        _Lev l = new _Lev("asdas");
        _Mammal l1 = new _Lev("kit");

        _Speakable s1 = new _Lev("asdasd");
        _Speakable s2 = new _Pingvin("sadasdasd");
        _Animal [] arr1 = {a1, a2, l, a};
        _Speakable [] arr2 = {l, l1, s2, s1, p};
        for (_Animal x: arr1) {
            if (x instanceof _Lev) {
                _Lev lev = (_Lev) x;
                System.out.println(x.name);
                lev.run();
                lev.eat();
                lev.sleep();
            }
            if (x instanceof _Bird){
                _Bird bird = (_Bird) x;
                System.out.println(bird.name);
                bird.eat();
                bird.sleep();
                bird.speak();
                bird.fly();
            }
            if (x instanceof _Mammal){
                _Mammal mamal = (_Mammal) x;
                System.out.println(mamal.name);
                mamal.run();
                mamal.eat();
                mamal.sleep();
                mamal.speak();
            }
        }
        //тоже самое для arr2
    }
}
abstract class _Animal {
    _Animal(String name) {
        this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}

abstract class _Fish extends _Animal {

    _Fish(String name) {
        super(name);
        this.name = name;
    }
    String name;
    public void sleep() {
        System.out.println("Vsegfa interesno nabludat kak sleep fish");
    }
    abstract void swim();
}

abstract class _Bird extends _Animal implements _Speakable{

    _Bird(String name) {
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

abstract class _Mammal extends _Animal implements _Speakable{

    _Mammal(String name) {
        super(name);
        this.name = name;
    }
    String name;
    abstract void run ();
}

interface _Speakable {
    default void speak() {
        System.out.println("somebody speak");
    }
}

class _Mechenosec extends Fish {

    _Mechenosec(String name) {
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

class _Pingvin extends _Bird {

    _Pingvin(String name) {
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

class _Lev extends _Mammal {

    _Lev(String name) {
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

