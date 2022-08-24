package Homework.Lesson23HW;

public class Test {//Test должен быть вынесен отдельно
    public static void abc(X2 x, Y3 y) {
        System.out.println("privet");
    }

    public static void abc(Y3 y, X2 x) {
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Y3 a = new Y3();
        //abc(a,a);//компилятор не знает который метод вызвать - ошибка
    }
}
