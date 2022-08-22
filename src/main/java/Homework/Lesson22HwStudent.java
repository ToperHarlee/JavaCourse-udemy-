package Homework;
//1.
public class Lesson22HwStudent {
    public Lesson22HwStudent(StringBuilder name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
    private StringBuilder name;
    private int course;
    private double grade;

    public void setName(StringBuilder name) {
        if(name.length() > 3 && !name.isEmpty()){
        this.name = name;
        }
    }

    public StringBuilder getName() {
//        StringBuilder res = new StringBuilder(name); // вернуть копию переменной
        return name;
    }

    public void setCourse(int course) {
        if (course > 1 && course <= 4) {
            this.course = course;
        }
    }

    public int getCourse() {
        return course;
    }

    public void setGrade(double grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }

    public double getGrade() {
        return grade;
    }

    public static void showInfo (Lesson22HwStudent n) {
        System.out.println(n.getName() + " , " + n.getCourse() + " , " +  n.getGrade());
    }
}

class TestStudent extends Lesson22HwStudent {
    public TestStudent(StringBuilder name, int course, double grade) {
        super(name, course, grade);
    }

    public static void main(String[] args) {
        TestStudent s = new TestStudent(new StringBuilder("Mike"), 2, 5);
//        s.setName(new StringBuilder("Mike"));
//        s.setCourse(2);
//        s.setGrade(5);
        showInfo(s);
    }
}