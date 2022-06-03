public class Lesson5HomeWork {
    Lesson5HomeWork(int nomerBileta, String Imya, String Familia, int godUchebi, double ocenkaMath, double ocenkaEkonomy,
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

class  BankAkkHw {
    //1.BankAkk------------------------------------------------------------------------------------
    BankAkkHw(int CardId, String CarholderName, double CardBalance){
        CardId = id;
        CarholderName = name;
        CardBalance = balance;
    }
    int id;
    String name;
    double balance;

    void popolnitBalance (double arg1) {
        double increaseBalance = balance + arg1;
        showBalance(increaseBalance);
    }

    void umenshitBalance (double arg1) {
        double decreaseBalance = balance - arg1;
        showBalance(decreaseBalance);
    }

    void showBalance (double arg1) {
        System.out.println("Va6 balance sostavlaet:  " + arg1);
    }
}

class Employee {
    //employe-----------------------------------------------------------------------------------------
    Employee (int nomerRabotnika, String Imya, int vozrast, double zarplata, String otdel) {
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
        System.out.println("teper va6a Zp  vdvoe bol6e"  + itogovayaZp);
    }
}





//задание 3 к дз 5 лекции --вынес в методы подсчет средней оценки и вывод информации о студентах
class StudentTest2 {
    public static void main(String[] args) {
        Lesson5HomeWork StudentMike = new Lesson5HomeWork(13, "Mike", "Bakhtin", 2022,
                3, 4, 5);
//        StudentMike.BiletNum = 13;
//        StudentMike.FirstName = "Mike";
//        StudentMike.LastName = "Baktin";
//        StudentMike.StudyYear = 2022;
//        StudentMike.AverageGradeMath = 3;
//        StudentMike.AverageGradeEkonmy = 4;
//        StudentMike.AverageGradeLanguage = 5;
        StudentMike.getFinalAverageGrade(StudentMike.BiletNum, StudentMike.FirstName, StudentMike.LastName,
                StudentMike.StudyYear, StudentMike.AverageGradeMath, StudentMike.AverageGradeEkonmy, StudentMike.AverageGradeLanguage);


        Lesson5HomeWork StudentVera = new Lesson5HomeWork(21, "Vera", "Bakhtina", 2022,
                4, 4, 5);
//        StudentVera.BiletNum = 21;
//        StudentVera.FirstName = "Vera";
//        StudentVera.LastName = "Baktina";
//        StudentVera.StudyYear = 2022;
//        StudentVera.AverageGradeMath = 4;
//        StudentVera.AverageGradeEkonmy = 4;
//        StudentVera.AverageGradeLanguage = 5;
        StudentVera.getFinalAverageGrade(StudentVera.BiletNum, StudentVera.FirstName, StudentMike.LastName,
                StudentVera.StudyYear, StudentVera.AverageGradeMath, StudentVera.AverageGradeEkonmy, StudentVera.AverageGradeLanguage);


        Lesson5HomeWork StudentKnopa = new Lesson5HomeWork(10, "Knopa", "Bakhtina", 2022,
                3, 3, 4);
//        StudentKnopa.BiletNum = 10;
//        StudentKnopa.FirstName = "Knopa";
//        StudentKnopa.LastName = "Baktina";
//        StudentKnopa.StudyYear = 2022;
//        StudentKnopa.AverageGradeMath = 3;
//        StudentKnopa.AverageGradeEkonmy = 3;
//        StudentKnopa.AverageGradeLanguage = 4;
        StudentKnopa.getFinalAverageGrade(StudentKnopa.BiletNum, StudentKnopa.FirstName, StudentKnopa.LastName,
                StudentKnopa.StudyYear, StudentKnopa.AverageGradeMath, StudentKnopa.AverageGradeEkonmy, StudentKnopa.AverageGradeLanguage);

        //BankAkk---------------------------------------------------------------------------------------------------------------------------
        BankAkkHw MikeBankAKk = new BankAkkHw(13, "Mike", 13.383);
//        MikeBankAKk.id = 13;
//        MikeBankAKk.name = "Mike";
//        MikeBankAKk.balance = 13.383;
        MikeBankAKk.popolnitBalance(200);
        System.out.println("a teper ktoto snal va6i dengi-------------");
        MikeBankAKk.umenshitBalance(150);

        //Employee--------------------------------------------------------
        Employee rabotnikMike = new Employee(13, "PiuPiu", 37, 100.000, "Ledokoli");
//        rabotnikMike.Employeeid = 13;
//        rabotnikMike.surname = "PiuPiu";
//        rabotnikMike.age = 37;
//        rabotnikMike.salary = 100.000;
//        rabotnikMike.department = "Ledokoli";
//        rabotnikMike.novayaZarplata(2);

        Employee rabotnikVera = new Employee(21, "ViuViu", 35, 75.000, "Tinkoff");
//        rabotnikVera.Employeeid = 21;
//        rabotnikVera.surname = "ViuViu";
//        rabotnikVera.age = 35;
//        rabotnikVera.salary = 75.000;
//        rabotnikVera.department = "Tinkoff";
//        rabotnikVera.novayaZarplata(2);

    }
}



