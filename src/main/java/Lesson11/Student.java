package Lesson11;

public class Student {
    String name;
    int course;
    double grade;
    Student (String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    //поменять значение обьектов местами ST1 и st2
    //в этом случае будут заменены КОПИИ переменных только в области видимости этого метода
    public static void swap (Student s1, Student s2) {
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println(s1.name);//knopa
        System.out.println(s2.name);//divan
    }
    //изменить значение переменной(элемент обьекта) с помощью копии
    //но сам обьект при этом не меняется
    public static void changeName (Student s1) {
        s1.name = "Vasikiy";

    }

    public static void main(String[] args) {
        Student st1 = new Student("Divan", 3, 9.7);
        Student st2 = new Student("Knopa", 1, 4.7);
        swap(st1,st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

        changeName(st2);
        System.out.println(st2.name);
    }
}
