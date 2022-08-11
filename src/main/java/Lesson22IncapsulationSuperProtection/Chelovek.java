package Lesson22IncapsulationSuperProtection;

public class Chelovek {
     final String pol;
     public Chelovek(String pol) {
          this.pol = pol;
     }

     private boolean smart;

     public boolean isSmart() {
          return smart;
     }

     public void setSmart(boolean s) {
          this.smart = s;
     }

     private StringBuilder name;
     //с помощью гет и сет методов обращаемся к переменной name
     public StringBuilder getName() {
          StringBuilder sb = new StringBuilder(name);
          return sb;
     }

     public void setName(StringBuilder n) {
          if (n != null && n.length() > 0 && n.equals(n)) {
               name = n;
          }
     }

     private int age;

     public int getAge() {
          return age;
     }

     public void setAge(int a) {
          if (a > 0 && a < 99) {
               age = a;
          }
     }

     private int weight;

     public int getWeight() {
          return weight;
     }

     public void setWeight(int w) {
         if (w < 300 && w > 0) {
              weight = w;
         }
     }
}

class Test extends Chelovek{

     public Test(String pol) {
          super(pol);
     }

     public static void show (Chelovek method) {
          System.out.println(method.getName() + " " + method.getAge() + " " + method.getWeight());
     }


     public static void main(String[] args) {
          Chelovek c = new Chelovek("male");
//          c.name = "peta";
//          c.age = 299;
//          c.weight = 489;
          c.setName(new StringBuilder("mike"));
          c.getName().append("!!!");
          System.out.println(c.getName());
          show(c);
//          c.setAge(35);
//          c.setWeight(80);
//          System.out.println(c.getName());
//          System.out.println(c.getAge());
//          System.out.println(c.getWeight());
//          c.setWeight(-900);
//          System.out.println(c.getWeight());
     }
}
