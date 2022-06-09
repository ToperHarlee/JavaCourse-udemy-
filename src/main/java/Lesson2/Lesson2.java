package Lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;
        byte b3 = 100;
        show(b1, b2, b3);

        short s1 = 5;
        short s2 = -10;
        short s3 = 0;

        int i1 = 500;

        long l1 = 1000;
        long l2 = 10000000000L;
        long l3 = 5L;

        float f1 = 3.14f;
        float f2 = 20;//int

        double d1 = 5.5D;
        double d2 = 87.5;

        char c1 = 'a';//char - символ
        char c2 = 'A';
        char c3 = '7';
        char c4 = 300;//300 исмвол в юникоде -- 10 ричная система счисления
        char c5 = '\u1234';//16 система счисления

        boolean bool1 = true;
        boolean bool2 = false;

        int a1 = 60;//60
        int a2 = 0b111100;//60
        int a3 = 074;//8ричная сист 60
        int a4 = 0x3C;//16 ричная система 60

        int a5 = 1_000_000;

        System.out.println(b1 + b2 + b3);

        //homework
        //part1
        byte h1 = 12;
        byte h2 = 0b1100;
        byte h3 = 014;
        byte h4 = 0xC;

        short g1 = 1300;
        short g2 = 0b10100010100;
        short g3 = 02424;
        short g4 = 0x514;

        int x1 = 71;
        int x2 = 0b111001;
        int x3 = 057;
        int x4 = 0x39;

        long w1 = 123456789l;
        long w2 = 0b111010110111100110100010101;
        long w3 = 0726746425;
        long w4 = 0x75BCD15;

        //part2
        float fl1 = 5.678f;
        double db1 = 5.78999;
        boolean bl1 = true;
        float fl2 = 77.24244242f;
        double db2 = 774.444;
        boolean bl3 = false;
        System.out.println("this float is " + fl1 + "this double is " + db1 + "this boolean is " + bl1);
        System.out.println("this float is " + fl2 + "this double is " + db2 + "this boolean is " + bl3);

        //part3
        char ch1 = 'p';
        char ch2 = 'i';
        char ch3 = 'z';
        char ch4 = 'd';
        char ch5 = 'e';
        char ch6 = 't';
        char ch7 = 's';
        System.out.println(ch1 + ch2 + ch3 + ch4 + ch5 + ch6 + ch7);
        char ch8 = 445 + 645 + 332 + 228;
        char ch9 = '\u4412';
        char ch10 = '\u3344';
        System.out.println(ch8 + "and another thing..." + ch9 + "and" + ch10);

    }

    public static void show (int arg1, int arg2, int arg3){
        int a = arg1;
        int b = arg2;
        int c = arg3;
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
    }
 }
