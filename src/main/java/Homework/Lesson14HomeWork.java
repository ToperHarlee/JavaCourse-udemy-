package Homework;

public class Lesson14HomeWork {
    public static void oClock () {
        Hour: for (int hour = 0; hour <= 6; hour++) {
            System.out.println(hour);

            Minute: for (int minute = 0; minute <= 59; minute++) {
                if (hour > 1 && minute % 10 == 0) {
                    //т.е. minute % 10 == 0 значит 60 / 10 = 6 -- целое число
                   break Hour;
                }
                Second: for(int second = 0; second <= 59; second++) {
                    System.out.println(hour + " : " + minute + " : " + second);
                    if (second * hour > minute) {
                        //т.е. 60 > 59 >> следующая минута
                        continue Minute;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        oClock();
    }
}
