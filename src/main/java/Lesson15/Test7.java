package Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money  = 100;

        do {
            System.out.println("delayte stavki");
            System.out.println("you lose" + "& you have " + money + " deposit");
            money -= 10;
        } while (money > 50);
    }
}
