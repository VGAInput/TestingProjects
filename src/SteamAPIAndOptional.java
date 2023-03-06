import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class SteamAPIAndOptional {

    public static void main(String[] args) {
        task_1();
        task_2();
    }

    private static void task_1() {
        /*
        Напишите метод findMinMax, находящий в стриме минимальный и максимальный
        элементы всоответствии порядком, заданным Comparator'ом.
        */

        List<Integer> randomNumbers = new ArrayList<>();

        randomNumbers.add(12);
        randomNumbers.add(4);
        randomNumbers.add(560);
        randomNumbers.add(1024);
        randomNumbers.add(3);
        randomNumbers.add(12);
        randomNumbers.add(-78);
        randomNumbers.add(1);
        randomNumbers.add(64);
        randomNumbers.add(0);
        randomNumbers.add(100);

        findMinMax(randomNumbers.stream(), (v1, v2) -> v2 - v1, (v1, v2) -> System.out.println(v1 + v2));
    }

    public static <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<? extends T> list = stream.sorted(order).toList();
        minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));
    }

    private static void task_2() {

        /*
        Реализуйте метод, который принимает на вход Список целых чисел
        и определяет количество четных и выводит их в консоль.
        */

        List<Integer> exampleIntList = new ArrayList<Integer>();

        exampleIntList.add(12);
        exampleIntList.add(4);
        exampleIntList.add(560);
        exampleIntList.add(1024);
        exampleIntList.add(3);
        exampleIntList.add(11);
        exampleIntList.add(-78);
        exampleIntList.add(1);
        exampleIntList.add(63);
        exampleIntList.add(0);
        exampleIntList.add(100);

        exampleIntList.removeIf((Integer e) -> e % 2 == 1);
        System.out.println(exampleIntList);
    }
}
