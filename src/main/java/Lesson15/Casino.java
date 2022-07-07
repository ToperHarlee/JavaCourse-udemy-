package Lesson15;

import java.util.Scanner;

public class Casino {
       //допишу введение ставки пользователем + проверку +

     public static void scaner () {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Делайте ставку!");
         while (!scanner.hasNextInt() || !scanner.hasNextDouble()) {//проверка на то что вводится число
             String text = scanner.next();
             System.out.println("Введите числовое значение! вместо -----> "+ text);
         }
         int index = scanner.nextInt();
         System.out.println("Введено целое значение " + index);
     }

     public static void debtCharge (double debt) {
         scaner();
         double money  = Math.random() * debt;
         if (money < debt) {
             do {
                 System.out.println("delayte stavki");
                 System.out.println("you lose" + "& you have " + money + " deposit");
                 money -= 10;
             }while (money > 50);
         } else {
             System.out.println("you Win! " + money);
         }
     }


    public static void main(String[] args) {
        debtCharge(50);
    }
}

 class AdvancedScanner {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите число");
//        while (!scanner.hasNextInt() || !scanner.hasNextDouble() || scanner.hasNext()) {//проверка на то что вводится число
//            String text = scanner.next();
//            System.out.println("Введите числовое значение! вместо -----> "+ text);
//        }
//        int index = scanner.nextInt();
//        System.out.println("Введено целое значение " + index);
//    }
}