package Homework.Lesson23HW;

import Homework.Lesson23HW1.Y1;
//Test3
public class X1 {
    public X1() {
        System.out.println("X");
    }
    public  X1 (int i){
        System.out.println("X" + i);
    }
    private boolean abc () {
        return false;
    }

    public static void main(String[] args) {
        X1 x = new Y1(18);//false тк вызываем в родительском классе и метод вернет фолс
        System.out.println(x.abc());
    }
}
