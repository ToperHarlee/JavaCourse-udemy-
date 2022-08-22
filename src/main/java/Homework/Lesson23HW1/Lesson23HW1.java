package Homework.Lesson23HW1;

import Homework.Lesson23HW.Lesson23HomeWork;


public class Lesson23HW1 extends Lesson23HomeWork {
    Lesson23HW1 () {
        super();//нужно обращение к родительскому классу и в родительском же указать конструктор как protected
    }
    public void abc() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        Lesson23HW1 l = new Lesson23HW1();
        l.abc();//Y тк вызов runtime и метод перезаписан в этом классе
    }
}
