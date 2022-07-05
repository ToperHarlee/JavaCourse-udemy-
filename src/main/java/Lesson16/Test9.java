package Lesson16;

public class Test9 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2);//false разные обьекты
        System.out.println(s1.equals(s2));//true
        String s3 = "privet";
        String s4 = "privet";
        System.out.println(s3 == s4);//true в string пуле уже удет привет
        System.out.println(s3.equals(s4));//true
        System.out.println(s1!=s4);//true

        String s10 = "Kak Dela?";
        String s11 = "Kak dela?";
        System.out.println(s10.equalsIgnoreCase(s11));//сравнивая игнорируя высоту
    }
}
