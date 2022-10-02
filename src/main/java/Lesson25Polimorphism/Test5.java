package Lesson25Polimorphism;

public class Test5 {
    public static void main(String[] args) {
        String [] arr1 = {"hello", "bye"};
        Object [] arr2 = arr1;
        String [] arr3 = (String[]) arr2;
        //arr3 [0] = new StringBuilder("ok");
        arr2[0] = new StringBuilder("ok");
    }
}
