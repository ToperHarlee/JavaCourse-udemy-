package Lesson13;

public class Lesson13 {
     //Switch

}

class  Student {
    int grade;
    Student (int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1  = new Student(3);
//        if (st1.grade == 2) {
//            System.out.println("студент двачер");
//        } else if (st1.grade == 3) {
//            System.out.println("Троечник");
//        } else if (st1.grade == 4) {
//            System.out.println("norm");
//        } else if (st1.grade == 5) {
//            System.out.println("Задрот");
//        } else {
//            System.out.println("украли дневник");
//        }
        switch (st1.grade) {
            case 2: System.out.println("Двоечник");
                break;
            case 3: System.out.println("Троечник");
                break;
            case 4: System.out.println("Норм");
                break;
            case 5: System.out.println("Задрот");
                break;
            default: System.out.println("дневник украли");
        }
    }
}
