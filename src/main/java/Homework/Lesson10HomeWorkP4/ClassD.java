package Homework.Lesson10HomeWorkP4;
import java.lang.String;

import Homework.Lesson10HomeWorkP4.Lesson10HomeWorkP5.ClassE;
import Homework.Lesson10РHomeWorkP1.ClassA;
import static Homework.Lesson10РHomeWorkP1.ClassA.*;
import Homework.Lesson10РHomeWorkP1.Lesson10РHomeWorkP2.ClassB;
import static Homework.Lesson10РHomeWorkP1.Lesson10РHomeWorkP2.ClassB.*;
import Homework.Lesson10РHomeWorkP1.Lesson10РHomeWorkP2.Lesson10РHomeWorkP3.ClassC;
import static Homework.Lesson10РHomeWorkP1.Lesson10РHomeWorkP2.Lesson10РHomeWorkP3.ClassC.*;
import static Homework.Lesson10HomeWorkP4.Lesson10HomeWorkP5.ClassE.*;


public class ClassD {


    public static void main(String[] args) {
        System.out.println(ClassA.r);
        ClassA.showClassA();
        ClassB.s4italka();
        ClassB.showMust("GO","on");
        ClassC.summFromClassC(4,5);
        ClassE.showClassE();


        System.out.println(r);
        showClassA();
        s4italka();//b
        showMust("go","on");//b
        summFromClassC(5,7);
        showClassE();

    }

}
