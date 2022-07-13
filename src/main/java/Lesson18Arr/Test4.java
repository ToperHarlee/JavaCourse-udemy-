package Lesson18Arr;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int array1[] = {1,9,3,-8,0,5,4,1};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + "");
        }
        System.out.println("---------------------");
        Arrays.sort(array1); //сортирует от меньшего к большему
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i] + "");
        }
        System.out.println(array1.toString());//привести к строке(посмотреть самому)
        //binarySearch - ищет элемент по индексу(работает только в отсортированном массиве)
//        int index1 = Arrays.binarySearch(array1, 5);
//        System.out.println("---------------------");
//        //несуществующий индекс при этом методе всегда со знаком - и всегда на -1 больше
//        System.out.println(index1);
    }
}
