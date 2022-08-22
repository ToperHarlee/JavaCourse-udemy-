package Lesson23OverridingHidingFinal;

public class Test7 {
    public static void main(String[] args) {
        A1 c1 = new C1();
        c1.abc(new B1());//A
        //любой обьект B = A т.к. В extends A
        /*c1 ссылается на обьект С1 но принадлежит она А1
        следовательно вызывать методы в из В и С она не может а может только те что есть
        в А1 --> АВС(А1 а)
         */
    }
}

class A1 {
    void  abc (A1 a) {
        System.out.println("A");
    }
}

class B1 extends A1 {
    /*void  abc (A1 a) {
        System.out.println("Aммммм");
    }
    если бы перезаписать этот метод тогда выводилось бы Амммм*/
    void abc (B1 b1) {
        System.out.println("B");
    }
}

class C1 extends B1 {
    void abc (B1 b2) {
        System.out.println("C");
    }
}
