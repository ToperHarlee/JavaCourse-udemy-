package Lesson15;

public class Test9 {

    public static void main(String[] args) {
        int hour = 0;

      Outer:  do {
            hour++;
            int minute = 0;

          Inner:  while (minute < 60){
                if (minute == 20) {
                    continue Outer;
                }
              System.out.println(hour + ": " + minute);
              minute++;
            }
            //hour++;//infinite loop
        } while (hour < 24);

    }

}
