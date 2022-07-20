package Homework;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicates {
    /*найти дубликаты в массиве String и вывести на экран с
    количеством совпадений  banana - 3 apple - 2 итд по возрастанию
     */

    public static <Doubles> List<Doubles> checkDoubles(Doubles[] strings) {
        int count = 0;
        Set<Doubles> duplicates = new HashSet<>();//<---коллекция для хранения дубликатов
        for (int i = 0; i < strings.length; i++) {
            Doubles e1 = strings[i];//проходим первый раз вытаскиваем значения
            if (e1 == null){ continue;}
            for (int j = 0; j < strings.length; j++) {
                if (i == j) continue; // не проверяем элемент с собой же
                Doubles e2 = strings[j];
                if (e1.equals(e2)) {// дубликат добавляем в коллекцию
                    duplicates.add(e2);
                    count++;
                }
            }
        }

        return new ArrayList<>(duplicates);
    }



    /*уже из коллекции берем и делаем ....что то*/
    public static int countWords(ArrayList<String> WordsArr, String word) {
        return Collections.frequency(WordsArr, word);
    }

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango", "banana", "banana", "apple"};
        System.out.println(checkDoubles(fruits));

        //стримы
        var freq = Arrays.stream(fruits)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));
        System.out.println(freq);

        //стримы
        System.out.println("wrong : "+(fruits.length - Arrays.stream(fruits).distinct().count()));
        Supplier<Stream<String>> sp = () -> Arrays.stream(fruits);
        Predicate<String> p = s -> sp.get().filter(i -> s.equals(i)).count() == 1;
        System.out.println("not wrong : "+(fruits.length - sp.get().filter(p).count()));

        //коллекции
        ArrayList<String> WordsArr = new ArrayList<>();
        WordsArr.add("Франция");
        WordsArr.add("Германия");
        WordsArr.add("Монако");
        WordsArr.add("Испания");
        WordsArr.add("Италия");
        WordsArr.add("Австрия");
        WordsArr.add("Испания");
        WordsArr.add("Монако");
        WordsArr.add("Грузия");
        WordsArr.add("Монако");
        WordsArr.add("Испания");
        WordsArr.add("Италия");
        WordsArr.add("Монако");
        WordsArr.add("Сингапур");
        WordsArr.add("Армения");

        System.out.println("Наш массив " + WordsArr);

        for (int i = 0; i < WordsArr.size(); i++) {
            if (countWords(WordsArr, WordsArr.get(i)) == 1) {
                System.out.println(" Уникальные слова " + WordsArr.get(i));
                System.out.println("Слово Испания повторяется " +
                        Collections.frequency(WordsArr, "Испания"));
            }
        }
    }
}
