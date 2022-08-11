package Lesson22IncapsulationSuperProtection;

public class Test1 {
    public static void main(String[] args) {
        int i  = 2;
        String s = new String [] {"A", "B", "C", "D"}[i];//передать s iэлемент массива
        System.out.println(s);
    }
}
