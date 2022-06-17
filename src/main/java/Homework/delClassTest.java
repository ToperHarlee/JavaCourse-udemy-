package Homework;

import java.lang.reflect.Array;

public class delClassTest {

    int[] MyArr = new int[10];



    public void fillArr(int[] n) {

        for (int i = 0; i < n.length; i++) {
            n[i] = i;
            System.out.println(n[i] + "");
        }

    }



    public static void main(String[] args) {
        delClassTest f = new delClassTest();
        f = null;
        delClassTest x = new delClassTest();
        x.fillArr(x.MyArr);


    }

}
