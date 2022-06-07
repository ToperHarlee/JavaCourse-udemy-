public class Lesson6Homework {
//Lesson6 HW --1
    Lesson6Homework() {
        this(0,0,0,0);
    }

    Lesson6Homework(int A, int B, int C, int E){
        a = A;
        b = B;
        c = C;
        e = E;
    }

    int sum (){
        System.out.println("suuuma 0");
        return 0;
    }

    int sum (int A){
        int res = a + 0;
        System.out.println("suuuma 1x" + res);
        return res;

    }

    int sum (int a, int b){
        int res = a + b;
        System.out.println("suuuma 2x" + res);
        return a + b;
    }

    int sum (int a, int b, int c){
        int res = a + b + c;
        System.out.println("suuuma 3x" + res);
        return a + b + c;
    }

    int sum (int a, int b, int c, int e){
        int res = a + b + c + e;
        System.out.println("suuuma 4x" + res);
        return a + b + c + e;
    }

    int a;
    int b;
    int c;
    int e;

}

class HomeworkTest{
    public static void main(String[] args) {
        Lesson6Homework hw1 = new Lesson6Homework();
        System.out.println("parametri ne zadani summa =  " + hw1);
        System.out.println("summa 0  " + hw1.sum());
        hw1.sum(1);
        hw1.sum(1,2);
        hw1.sum(1,2,3);
        hw1.sum(1, 2, 3, 4);
    }
}
