package Lesson14;

public class Test2 {
    public static void main(String[] args) {
        for (int i = 1, g = 10, k = 10; i <= 11 && i > -3 || i > 4 && g <= 100; i++ , g = g + 20, abc(10)){
            System.out.println(i);
            System.out.println(i + g);
        }

        System.out.println("-----------------------------");

        for (int i = 5; i < 11; i++){
            System.out.println(i);
            abc(10);
        }
    }

    static void abc (int n ) {
        System.out.println("-----" + n);
    }
}
