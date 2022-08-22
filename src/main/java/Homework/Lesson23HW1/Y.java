package Homework.Lesson23HW1;

import Homework.Lesson23HW.X;

public class Y extends X {

    public void abc() {
        System.out.println("Y");
    }
    public void def() {
        Y y = new Y();
        y.abc();
    }
    public void ghi() {
        X x = new Y();
        //x.abc(); //не может быть вызван тк в классе Y нет метода класса X
        //либо нужно указать супер
    }
}
