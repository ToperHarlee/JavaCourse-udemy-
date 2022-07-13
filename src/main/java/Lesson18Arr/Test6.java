package Lesson18Arr;

public class Test6 {
    public static void maxMin(double [] array) {
        //максимальный и минимальный элемент в массиве ищем
        double max = array[0];
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                //при счете каждый следующий элемент становится [0] и с ним уже сравнивается следующий
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("minim el massiva  " + min + " maximalniy el " + max);
    }

    public static void main(String[] args) {
        double [] array1 = {1.05, -3.14, 8.0, 9.19, -3, 0};
        maxMin(array1);
        System.out.println("-------------");
        maxMin(new double[]{2.5, -1.3});
    }
}
