public class Lesson4HomeWorkStudentID {
    int BiletNum;
    String FirstName;
    String LastName;
    int StudyYear;
    double AverageGradeMath;
    double AverageGradeEkonmy;
    double AverageGradeLanguage;


}
//задание 3 к дз 5 лекции --вынес в методы подсчет средней оценки и вывод информации о студентах
class StudentTest {
    public static void main(String[] args) {
        Lesson4HomeWorkStudentID StudentMike = new Lesson4HomeWorkStudentID();
        StudentMike.BiletNum = 13;
        StudentMike.FirstName = "Mike";
        StudentMike.LastName = "Baktin";
        StudentMike.StudyYear = 2022;
        StudentMike.AverageGradeMath = 3;
        StudentMike.AverageGradeEkonmy = 4;
        StudentMike.AverageGradeLanguage = 5;
                double finalAverageGradeMike = (StudentMike.AverageGradeMath + StudentMike.AverageGradeEkonmy + StudentMike.AverageGradeLanguage) / 3;
        System.out.println("StudentMike info:  Bilet num: " + StudentMike.BiletNum + "  First name: " + StudentMike.FirstName + "  Last name: " + StudentMike.LastName + "  Sudy Year: " +
                " Average Grade Math: " + StudentMike.AverageGradeMath + " Average grade Ekonomy: " + StudentMike.AverageGradeEkonmy + " Average grade Language: " + StudentMike.AverageGradeLanguage +
                " finalAverageGrade  " + finalAverageGradeMike);

        Lesson4HomeWorkStudentID StudentVera = new Lesson4HomeWorkStudentID();
        StudentVera.BiletNum = 21;
        StudentVera.FirstName = "Vera";
        StudentVera.LastName = "Baktina";
        StudentVera.StudyYear = 2022;
        StudentVera.AverageGradeMath = 4;
        StudentVera.AverageGradeEkonmy = 4;
        StudentVera.AverageGradeLanguage = 5;

                double finalAverageGradeVera = (StudentVera.AverageGradeMath + StudentVera.AverageGradeEkonmy + StudentVera.AverageGradeLanguage) / 3;
        System.out.println("StudentVera info:  Bilet num: " + StudentVera.BiletNum + "  First name: " + StudentVera.FirstName + "  Last name: " + StudentVera.LastName + "  Sudy Year: " +
                " Average Grade Math: " + StudentVera.AverageGradeMath + " Average grade Ekonomy: " + StudentVera.AverageGradeEkonmy + " Average grade Language: " + StudentVera.AverageGradeLanguage +
                " finalAverageGrade  " + finalAverageGradeVera);

        Lesson4HomeWorkStudentID StudentKnopa = new Lesson4HomeWorkStudentID();
        StudentKnopa.BiletNum = 10;
        StudentKnopa.FirstName = "Knopa";
        StudentKnopa.LastName = "Baktina";
        StudentKnopa.StudyYear = 2022;
        StudentKnopa.AverageGradeMath = 3;
        StudentKnopa.AverageGradeEkonmy = 3;
        StudentKnopa.AverageGradeLanguage = 4;

        double finalAverageGradeKnopa = (StudentKnopa.AverageGradeMath + StudentKnopa.AverageGradeEkonmy + StudentKnopa.AverageGradeLanguage) / 3;
        System.out.println("Studen Knopa info:  Bilet num: " + StudentKnopa.BiletNum + "  First name: " + StudentKnopa.FirstName + "  Last name: " + StudentKnopa.LastName + "  Sudy Year: " +
                " Average Grade Math: " + StudentKnopa.AverageGradeMath + " Average grade Ekonomy: " + StudentKnopa.AverageGradeEkonmy + " Average grade Language: " + StudentKnopa.AverageGradeLanguage +
                " finalAverageGrade  " + finalAverageGradeKnopa);
    }
}
