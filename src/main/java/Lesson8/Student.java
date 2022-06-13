package Lesson8;

public class Student {
    String name;
    int course;
    //static final int count = 5;//static переменная принадлежащая всему классу(общая для всех обьектов)
    static int count;
    int a;


    public Student(String name2, int course2){
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " sozdan");
    }

    public static void showCount() {
        System.out.println("Vsego sozdano studentov  " + count);
    }

    public void showInfo(){
        System.out.println("Welcome to the student class!");
    }

    void abc(){
        //nonStatic переменная в nonStatic методе может быть использована
        a++;
        count++;
    }

    static void abcd(){
        count++;
        Student st2 = new Student("asdasda", 1);
        st2.a++;//a ne static
        //нет обьекта - нет инстанс переменной
    }

    public static void main(String[] args) {
//        Student st1 = new Student("mike", 1);
//        Student st2 = new Student("Vera", 2);
//        Student st3 = new Student("Knopa", 3);
//
//        System.out.println(st1.name);
//        System.out.println(count);//Student название класа //3 тк создано обьектов 3
//        Student.showCount();
//        st2.showCount();
        abcd();
        Student st3 = new Student("asdasda", 1);
        st3.abc();//ne static metodi nelza vizvat bez privazki ego k ob"ektu novomu

    }

}


class StudentTest{
//    public static void main(String[] args) {
//        Student st1 = new Student("mike", 1);
//        Student st2 = new Student("Vera", 2);
//        Student st3 = new Student("Knopa", 3);
//
//        System.out.println(st1.name);
//        System.out.println(Student.count);//Student название класа
//    }
}