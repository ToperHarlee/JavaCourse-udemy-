package Lesson23OverridingHidingFinal;

public class Test6 {
}

class Animal1 {
    static String showName () {
        return "Some Animal";
    }
    void showInfoAboutAnimal () {
        System.out.println("Name of Animal: " + showName());
    }
}

class Mouse1 extends  Animal1 {
    static String showName () {
        return "Mouse Jerry";
    }

    void showInfoAboutMouse () {
        System.out.println("Name of Mouse: " + showName());
    }

    public static void main(String[] args) {
        Animal1 a = new Mouse1();
        a.showInfoAboutAnimal();//mouse
        //----------------------------
        Mouse1 m = new Mouse1();
        m.showInfoAboutAnimal();
        m.showInfoAboutMouse();
    }
}