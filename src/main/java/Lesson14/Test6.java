package Lesson14;

public class Test6 {
    public void  time () {
        //название цикла label --> упрощает и улучшает код
      Outer:  for (int hour = 0; hour <= 23; hour ++) {
        //циклы можно подписывать в JAVA!!!(а не как в js)
            System.out.println("outer loop");

         Inner:   for (int minute = 0; minute <= 59; minute ++){
             if (minute == 20) {
                 continue Outer;
             }
                System.out.println(hour + ":" + minute);
//                if (minute == 30) {
//                    break Outer;
//                }
            }
            System.out.println("end outer loop");
        }
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.time();
    }
}
