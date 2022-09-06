package Homework.SideTasks;

/*Вам будет дан массив целых чисел.
 Ваша задача - взять этот массив и найти индекс N, где сумма целых чисел слева от N
 равна сумме целых чисел справа от N.
Если нет индекса, который мог бы сделать это, верните - 1.*/
public class TaskRightLeftSumm {
    public static int findEvenIndex(int[] arr) {
        int left = 0, right = 0;
        //пройти циклом по массиву в нем сравнить двумя циклами до индекса слева и до индекса справа суммы
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                left = left + arr[j];//сумма до индекса слева
            }
            for(int x = arr.length - 1; x > i; x--){
                right = right + arr[x];//сумма до индекса справа (считаем с конца массива)
            }
            if(left == right) return i;//при совпадении сумм возвращаем индекс
        }
        return -1;
    }
}
