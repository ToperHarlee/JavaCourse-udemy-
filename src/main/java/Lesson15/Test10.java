package Lesson15;

public class Test10 {
    public static void main(String[] args) {
     Outer:   for (int hour = 0; hour < 24; hour++) {
            int minute = 0;

        Inner:    while (minute < 60){
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }
}
