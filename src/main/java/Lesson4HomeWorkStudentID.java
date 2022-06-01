public class Lesson4HomeWorkStudentID {
     int BiletNum;
     String FirstName;
     String LastName;
     int StudyYear;
     double AverageGradeMath;
     double AverageGradeEkonmy;
     double AverageGradeLanguage;

     double getFinalAverageGrade(double arg1, double arg2, double arg3) {
        double finalAverageGrade = (arg1 + arg2 + arg3) / 3;
         return finalAverageGrade;
    }

     void  visionFinalAverageGrade (int arg1, String arg2, String arg3, int arg4, double arg5, double arg6, double arg7) {
         System.out.println("Studen MIke info:  Bilet num: " + arg1 + "  First name: " + arg2 + "  Last name: " + arg3 + "  Sudy Year: " +
                 arg4 + " Average Grade Math: " + arg5 + " Average grade Ekonomy: " + arg6 + " Average grade Language: " + arg7 +
                 " finalAverageGrade  " + getFinalAverageGrade(arg5, arg6, arg7));
    }
}

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
        StudentMike.getFinalAverageGrade(StudentMike.AverageGradeMath, StudentMike.AverageGradeEkonmy, StudentMike.AverageGradeLanguage);
        StudentMike.visionFinalAverageGrade(StudentMike.BiletNum, StudentMike.FirstName, StudentMike.LastName,
                StudentMike.StudyYear, StudentMike.AverageGradeMath, StudentMike.AverageGradeEkonmy, StudentMike.AverageGradeLanguage);

        Lesson4HomeWorkStudentID StudentVera = new Lesson4HomeWorkStudentID();
        StudentVera.BiletNum = 21;
        StudentVera.FirstName = "Vera";
        StudentVera.LastName = "Baktina";
        StudentVera.StudyYear = 2022;
        StudentVera.AverageGradeMath = 4;
        StudentVera.AverageGradeEkonmy = 4;
        StudentVera.AverageGradeLanguage = 5;
        StudentVera.getFinalAverageGrade(StudentVera.AverageGradeMath, StudentVera.AverageGradeEkonmy, StudentVera.AverageGradeLanguage);
        StudentVera.visionFinalAverageGrade(StudentVera.BiletNum, StudentVera.FirstName, StudentMike.LastName,
                StudentVera.StudyYear, StudentVera.AverageGradeMath, StudentVera.AverageGradeEkonmy, StudentVera.AverageGradeLanguage);

        Lesson4HomeWorkStudentID StudentKnopa = new Lesson4HomeWorkStudentID();
        StudentKnopa.BiletNum = 10;
        StudentKnopa.FirstName = "Knopa";
        StudentKnopa.LastName = "Baktina";
        StudentKnopa.StudyYear = 2022;
        StudentKnopa.AverageGradeMath = 3;
        StudentKnopa.AverageGradeEkonmy = 3;
        StudentKnopa.AverageGradeLanguage = 4;
        StudentKnopa.getFinalAverageGrade(StudentKnopa.AverageGradeMath, StudentKnopa.AverageGradeEkonmy, StudentKnopa.AverageGradeLanguage);
        StudentKnopa.visionFinalAverageGrade(StudentKnopa.BiletNum, StudentKnopa.FirstName, StudentKnopa.LastName,
                StudentKnopa.StudyYear, StudentKnopa.AverageGradeMath, StudentKnopa.AverageGradeEkonmy, StudentKnopa.AverageGradeLanguage);
//        double finalAverageGradeKnopa = (StudentKnopa.AverageGradeMath + StudentKnopa.AverageGradeEkonmy + StudentKnopa.AverageGradeLanguage) / 3;
//        System.out.println("Studen Knopa info:  Bilet num: " + StudentKnopa.BiletNum + "  First name: " + StudentKnopa.FirstName + "  Last name: " + StudentKnopa.LastName + "  Sudy Year: " +
//                " Average Grade Math: " + StudentKnopa.AverageGradeMath + " Average grade Ekonomy: " + StudentKnopa.AverageGradeEkonmy + " Average grade Language: " + StudentKnopa.AverageGradeLanguage +
//                " finalAverageGrade  " + finalAverageGradeKnopa);
    }
}
