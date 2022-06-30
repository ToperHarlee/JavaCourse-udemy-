package Homework;

public class Lesson15HomeWork {
    public static void oClock () {
        int hour = 0;
        int minute = 0;
        int second = 0;
        Hour: while (hour < 6) {
            hour++;
            System.out.println(hour);
            Minute: do {
                minute++;
                if (hour > 1 && minute % 10 == 0 || minute == 60) {
                    //т.е. minute % 10 == 0 значит 60 / 10 = 6 -- целое число
                    break Hour;
                }
                Second: while (second < 59) {
                    second++;
                    System.out.println(hour + " : " + minute + " : " + second);
                    if (second * hour > minute) {
                        //т.е. 60 > 59 >> следующая минута
                        continue Minute;
                    }
                }

            }while (minute < 59);
        }
    }

    public static void main(String[] args) {
        oClock();
    }
}
