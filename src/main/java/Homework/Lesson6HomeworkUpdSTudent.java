package Homework;

public class Lesson6HomeworkUpdSTudent{

    Lesson6HomeworkUpdSTudent(){
        this(0,null,null,0,0.0,0.0,0.0);
    }

    Lesson6HomeworkUpdSTudent(int nomerBileta, String Imya, String Familia, int godUchebi){
        this(nomerBileta,Imya,Familia,godUchebi, 0.0,0.0,0.0);
        nomerBileta = BiletNum;
        Imya = FirstName;
        Familia = LastName;
        godUchebi = StudyYear;
    }


    Lesson6HomeworkUpdSTudent(int nomerBileta, String Imya, String Familia, int godUchebi, double ocenkaMath, double ocenkaEkonomy,
                    double ocenkaLanguage){
        nomerBileta = BiletNum;
        Imya = FirstName;
        Familia = LastName;
        godUchebi = StudyYear;
        ocenkaMath = AverageGradeMath;
        ocenkaEkonomy = AverageGradeEkonmy;
        ocenkaLanguage = AverageGradeLanguage;
    }
    int BiletNum;
    String FirstName;
    String LastName;
    int StudyYear;
    double AverageGradeMath;
    double AverageGradeEkonmy;
    double AverageGradeLanguage;
    //2.student----------------------------------------------
    void getFinalAverageGrade(int arg1, String arg2, String arg3, int arg4, double arg5, double arg6, double arg7) {
        double finalAverageGrade = (arg5 + arg6 + arg7) / 3;
        System.out.println("Studen MIke info:  Bilet num: " + arg1 + "  First name: " + arg2 + "  Last name: " + arg3 + "  Sudy Year: " +
                arg4 + " Average Grade Math: " + arg5 + " Average grade Ekonomy: " + arg6 + " Average grade Language: " + arg7 +
                " finalAverageGrade  " + finalAverageGrade);
    }
}

class  BankAkkHw6 {
    //1.BankAkk------------------------------------------------------------------------------------
    BankAkkHw6(int CardId, String CarholderName, double CardBalance){
        CardId = id;
        CarholderName = name;
        CardBalance = balance;
    }
    int id;
    String name;
    double balance;

    void popolnitBalance (double arg1) {
        System.out.println("Va6 balance :  " + balance);
        double increaseBalance = balance + arg1;
        showBalance(increaseBalance);
    }

    void umenshitBalance (double arg1) {
        System.out.println("Va6 balance :  " + balance);
        double decreaseBalance = balance - arg1;
        showBalance(decreaseBalance);
    }

    void showBalance (double arg1) {
        System.out.println("Va6 balance " + name + " sostavlaet:  " + arg1);
    }
}

class Employee6 {
    //employe-----------------------------------------------------------------------------------------
    Employee6 (int nomerRabotnika, String Imya, int vozrast, double zarplata, String otdel) {
        nomerRabotnika = Employeeid;
        surname = Imya;
        age = vozrast;
        salary = zarplata;
        department = otdel;
    }
    int Employeeid;
    String surname;
    int age;
    double salary;
    String department;

    void novayaZarplata (double arg1) {
        double itogovayaZp = salary * arg1;
        System.out.println("teper va6a Zp  " + surname +  "  vdvoe bol6e"  + itogovayaZp);
    }
}





//задание 2 к дз 6 лекции --три конструктора и дефолтные значения
class StudentTest6 {
    public static void main(String[] args) {
        Lesson6HomeworkUpdSTudent StudentMike = new Lesson6HomeworkUpdSTudent(13, "Mike", "Bakhtin", 2022,
                3, 4, 5);
        StudentMike.getFinalAverageGrade(StudentMike.BiletNum, StudentMike.FirstName, StudentMike.LastName,
                StudentMike.StudyYear, StudentMike.AverageGradeMath, StudentMike.AverageGradeEkonmy, StudentMike.AverageGradeLanguage);


        Lesson6HomeworkUpdSTudent StudentVera = new Lesson6HomeworkUpdSTudent(21, "Vera", "Bakhtina", 2022,
                4, 4, 5);
        StudentVera.getFinalAverageGrade(StudentVera.BiletNum, StudentVera.FirstName, StudentMike.LastName,
                StudentVera.StudyYear, StudentVera.AverageGradeMath, StudentVera.AverageGradeEkonmy, StudentVera.AverageGradeLanguage);


        Lesson6HomeworkUpdSTudent StudentKnopa = new Lesson6HomeworkUpdSTudent(10, "Knopa", "Bakhtina", 2022,
                3, 3, 4);
        StudentKnopa.getFinalAverageGrade(StudentKnopa.BiletNum, StudentKnopa.FirstName, StudentKnopa.LastName,
                StudentKnopa.StudyYear, StudentKnopa.AverageGradeMath, StudentKnopa.AverageGradeEkonmy, StudentKnopa.AverageGradeLanguage);
        //lesson6HW -- 2.
        Lesson6HomeworkUpdSTudent noneStudent = new Lesson6HomeworkUpdSTudent();
        noneStudent.getFinalAverageGrade(noneStudent.BiletNum, noneStudent.FirstName, noneStudent.LastName,
                noneStudent.StudyYear, noneStudent.AverageGradeMath, noneStudent.AverageGradeEkonmy, noneStudent.AverageGradeLanguage);

        Lesson6HomeworkUpdSTudent abiturient = new Lesson6HomeworkUpdSTudent(128,"Vasya","Pupkin",2010);
        abiturient.getFinalAverageGrade(abiturient.BiletNum, abiturient.FirstName, abiturient.LastName,
                abiturient.StudyYear, abiturient.AverageGradeMath, abiturient.AverageGradeEkonmy, abiturient.AverageGradeLanguage);

        Lesson6HomeworkUpdSTudent newStudent = new Lesson6HomeworkUpdSTudent(228,"Kon","r=vYablokah", 2009,5,3,3);
        newStudent.getFinalAverageGrade(newStudent.BiletNum, newStudent.FirstName, newStudent.LastName,
                newStudent.StudyYear, newStudent.AverageGradeMath, newStudent.AverageGradeEkonmy, newStudent.AverageGradeLanguage);


        //BankAkk---------------------------------------------------------------------------------------------------------------------------
        BankAkkHw6 MikeBankAKk = new BankAkkHw6(13, "Mike", 13.383);
        MikeBankAKk.popolnitBalance(200);
        System.out.println("a teper ktoto snal va6i dengi-------------");
        MikeBankAKk.umenshitBalance(150);

        //Homework.Employee--------------------------------------------------------
        Employee6 rabotnikMike = new Employee6(13, "PiuPiu", 37, 100.000, "Ledokoli");
        rabotnikMike.novayaZarplata(2);

        Employee6 rabotnikVera = new Employee6(21, "ViuViu", 35, 75.000, "Tinkoff");
        rabotnikVera.Employeeid = 21;
        rabotnikVera.novayaZarplata(2);

    }
}




