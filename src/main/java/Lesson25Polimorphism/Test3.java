package Lesson25Polimorphism;

public class Test3 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Man m = new Man();
        Student s = new Student();
        if (j instanceof Jumpable){
            System.out.println("J is Jumpable");
        }
        if (j instanceof Human) {
            System.out.println("m is Human");
        }
//        if (s instanceof Human) {
//            System.out.println("s is Human");
//            //между s и student никакой связи быть не может тк у s уже есть суперкласс Student
             // причем сабкласс s не может быть сабклассом Human тоже
//        }
        if (s instanceof Jumpable) {//тк s может имплементрировать интерфейс jumpable
            System.out.println("s is Jumpable");
        }
    }
}

interface Jumpable {}
class Human implements Jumpable{}
class Man extends Human {}
class Student{}