package Lesson3;

public class Lesson3 {
    public static void main(String[] args) {
//        int a = 5;
//        int b = a;
//
//        int x = 1, y = 2, z = 3;

        //арифметич операторы
        int a = 5;
        int b = 10;
        int c = a + b;
        System.out.println(a + b);
        System.out.println(c);

        int c1 = b - a;
        System.out.println(c1);
        int c2 = a * b;
        System.out.println(c2);

        double a1 = 10;
        double b1 = 3;
        double c3 = a1/b1;
        System.out.println(c3);

        int a2 = 10;
        int b2 = 3;
        int celayaChast = a2 / b2;
        int c4 = a2 % b2;
        System.out.println(c4);
        System.out.println(celayaChast);

        double a3 = 5.5;
        double b3 = 3.4;
        double c5 = a3 / b3;
        System.out.println(c5);

        int x1 = 5;
        int y1 = 3;
        int z = x1 - y1++;//4
        int z1 = x1 - ++y1;//1
        System.out.println(z);
        System.out.println(z1);

        int x2 = 10;
        int y2 = 5;
        int z2 = --x2 - y2;// z2 = 4

        int a4 = 5;// 6 - 5 - 5 + 5(тут 4 тк старое значение остается--используетя последнее СТАрое значение) = 0
        int b4 =  ++a4 - --a4 - a4-- + a4++;

        int f = 3;//
        f += 10;
        System.out.println(f);//13   f = f + 13
        f -= 2;//1
        f /= 2;//1.5
        f *= 2; // 6
        f += 1;//4

        int x3 = 3;
        int y3 = 30;
        int z3 = 0;
        x3=y3=z3=18; // x3 y3 z3 -- 18

        long l = 100L;
        int j = 10;

         l = j;

         short s = 50;
         int d = s;

         float f1 = 3.14F;
         double d1 = f1;
         float f2 = a;
         double d2 = a;

         int n = 3;
         int m = 5;
         int h = 5;
         boolean k = n > m;//false >= тоже false
        boolean k1 = n < m;//true
        boolean k3 = m<=h;//true
        boolean k4 = n==m;//false
        boolean k5 = h==m;//true
        boolean k6 = n!=m;//true != --> неравно
        System.out.println(k);
        System.out.println(k1);

        boolean e = true;
        boolean r = false;
        boolean u = true;

        boolean res = e && r && u;// false
        boolean res1 = e || r || u;//true

        //!true = false; !false = true.

        boolean e1 = true;
        boolean r1 = false;
        System.out.println(!e1);//false
        System.out.println(!r1);//true

        int n1 = 10;
        int m1 = 5;
        int h1 = 0;
        int j1 = 100;
        boolean res3 = n1 < m1 && h1++ == j1;//false
        boolean res4 = n1 > m1 || ++h1 == j1;//true
        boolean res5 = n1 > m1 | ++h1 == j1;//проверяются все условия
        boolean res6 = n1 < m1 & ++h1 == j1;
        boolean res2 = !(n1 > m1);
        System.out.println(res2);//false
        System.out.println(!res2);//true

        int x = 10;
        int y = 5;
        System.out.println(x|y);//15
        System.out.println(x&y);//0

        boolean u1= true;
        boolean u2= true;
        boolean u3= true;
        boolean u4= false;
        System.out.println(u1^u2^u3^u4);//true

        int o = 10;
        int p = 3;
        int resOp = ++o - p *2;
        System.out.println(resOp);//5


    }
}
