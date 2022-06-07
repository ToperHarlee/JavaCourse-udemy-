public class Lesson6MethodOverloading {
   //метод overloading
   void show(int i1) {
       System.out.println(i1);
       System.out.println("datatype - int");
   }

   void show (int a, int b) {
       System.out.println(a);
       System.out.println("параметры должны различатся в одноименном методе иначе ошибка");
   }

   void show(boolean b1) {
       System.out.println(b1);
       System.out.println("datatype - boolean");
   }

   void show(String s1){
       System.out.println(s1);
       System.out.println("datatype - String");
   }

   void show(String s, int a) {
       System.out.println("string " + s + " int: " + a);
   }

    void show(int a, String s) {
        System.out.println("string " + s + " int: " + a);
    }

}

class MethodOverloadingTest {
    public static void main(String[] args) {
        Lesson6MethodOverloading mo = new  Lesson6MethodOverloading();
        int a = 500;
        mo.show(a);
        boolean b = true;
        mo.show(b);
        String s = "Asss";
        mo.show(s);
        mo.show("priv", 10);
    }
}
