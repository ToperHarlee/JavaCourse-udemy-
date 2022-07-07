package Homework;

public class Lesson16HomeWork {

    public void  email (String userMail) {
        String um = userMail;
        char res;

        for (int i = 0; i < um.length(); i++){
            res = um.charAt(i);
            if (res == '@') {
                System.out.println("Почта юзера :" + userMail.substring(userMail.indexOf("@")
                        + 1, userMail.indexOf(".")));
            } else if (userMail.contains(";")) {
                break;
            }
        }

    }

    //второй способ
    public void anotherMail (String s) {
        int a = 0;//@
        int b = 0;//.
        int i = 0;//; -- относительно нее пересчитывать строку

        while ( i < s.length() ){
            a = s.indexOf('@', i);
            b = s.indexOf('.',i);
            System.out.println(s.substring(a + 1, b));
            if (s.contains(";")) {
                break;
            } else {break;}
        }
    }


    public static void main(String[] args) {
          Lesson16HomeWork p = new Lesson16HomeWork();
          p.email("ya@yahoo.com");
          p.email("on@mail.ru");
          p.email("ona@gmail.com");
          System.out.println("-----------------------");
          p.anotherMail("ya@yahoo.com;");
          p.anotherMail("ona@gmail.com");
    }



}
