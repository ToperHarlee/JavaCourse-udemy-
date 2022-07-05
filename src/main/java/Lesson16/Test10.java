package Lesson16;

public class Test10 {
    public static void main(String[] args) {
        String x = "privet";
        String y = "privet".trim();
        System.out.println(x==y);//true -- трим не создаст новый оьект и у ссылается на х

        String x1 = "privet";
        String y1 = " privet".trim();
        System.out.println(x1==y1);//false тк трим уберет пробел и создаст новый обьект
    }
}
