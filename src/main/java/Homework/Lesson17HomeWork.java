package Homework;

public class Lesson17HomeWork {
    StringBuilder sb1;
    StringBuilder sb2;



    public static boolean sravni1(StringBuilder arg1, StringBuilder arg2) {
//
            if (arg1.toString().equals(arg2.toString()) && arg1 != null && !arg2.equals("\"-?\\\\d+(\\\\.\\\\d+)?\"")){
                System.out.println("Введенные значения"+ arg1 + arg2 +" совпадают");
                return true;
            } else {
                System.out.println("Введенные значения не совпдают");
                return  false;
            }

    }

    public static boolean sravni2 (StringBuilder arg1, StringBuilder arg2) {
        char a;
        char b;
        for (int i = 0, j = 0; i < arg1.length() && j < arg2.length(); i++ , j++) {

            if ( arg1.length() == arg2.length()) {
                System.out.println("Введенные значения"+ arg1 + arg2 +" совпадают");
                return true;
            }
            if (arg1.length() <= arg2.length() || arg1.capacity() >= arg2.capacity() || arg1.length() >= arg2.length()) {
                System.out.println("Введенные значения не совпдают");
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Test");
        StringBuilder b = new StringBuilder("Test");
        sravni1(a, b);
        sravni2(a,b);
    }
}
