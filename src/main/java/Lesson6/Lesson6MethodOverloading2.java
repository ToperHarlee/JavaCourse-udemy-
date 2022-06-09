package Lesson6;

public class Lesson6MethodOverloading2 {
    //Return type может быть одинаковый или различный
    //acces modiferied могуть быть одинаковые или различные
    //перезагруженные методы имеют одинаковые имена и разный список параметров!!!
    public int sum(int i1, int i2){
        return i1 + i2;
    }


    public String sum (String s1, String s2) {
        return s1 + s2;
    }

//    protected void sum(int a , int b){
//        System.out.println("privet");
//    }
}

class MethodOverloadingTest2 {
    public static void main(String[] args) {
        Lesson6MethodOverloading2 mo2 = new  Lesson6MethodOverloading2();

       int a = mo2.sum(5, 7);
        System.out.println(a);
        String s = mo2.sum("privet", "Knopa");
        System.out.println(s);
    }
}
