package Lesson23OverridingHidingFinal;

public class Test4 {
    void  abc (Animal a) {
        System.out.println("A");
    }
    void  abc (Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an  = new Mouse();
        t.abc(an);//A; переменные вызывают compile time binding
        an.getName();//B тк рантайм binding тк неможет определить жаба с какого обьекта метод
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}
