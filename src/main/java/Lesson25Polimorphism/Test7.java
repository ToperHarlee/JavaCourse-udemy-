package Lesson25Polimorphism;

public class Test7 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        System.out.println(7);
        int i1 = 3;
        short s2 = (short) i1;
        byte b2 = 3;
        short s1 = -6;
        char c1 = 100;
        final long l1 = 1;
        int l2 = (int) l1;

        int i10 = 111111;
        short s10 = (short) i10;
        System.out.println(s10);
        char c10 = (char) -8;
        System.out.println(c10);
        int i12 = (int) 3.14;
        System.out.println(i12);
        double d = 5984568.563;
        byte b12 = (byte) d;
        System.out.println(b12);

        int i  = 2147483647;
        System.out.println(i + 1);
        //меньший тип конвертируется в болший
        int i13  = 5;
        long l = 10;
        i = (int) (i * l);//casting
        i13 *= i;
        System.out.println(i + l);
        //если одно число целое а второе дробное то жаба приведет к дробному
        float f = 3.14f;
        int i2 = 10;
        System.out.println(f + i2);//14
        //если байт шорт и чар учавствуют в операциях то перед этим они ковертируются в инт
        byte b3 = 3;
        short s = 4;
        char c2 = 5;
        System.out.println(b3 + s + c2);//12
        System.out.println(b3++);//конвертации не будет тк исключение
        //использование ++ к байт не конвертирует результат оператора в инт
        byte b1 = 10;
        float f2 = 7;
        double d3 = 2.0;
        System.out.println(b1 + f2 - d3);//15 - double


        double d10 = 3.14;
        float f10 = 6.28f;

        float f11 = 0 * (float)1.5;
    }
}
