import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ex1(10, 100);
        ex2(10, 100);
    }

    /*1. Пусть дан произвольный список целых чисел, удалить из него четные числа*/
    static void ex1(int num, int max){
        System.out.println("Ex 1");

        List<Integer> list = new ArrayList<>();
        randomIntList(list, num, max);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
        System.out.println();
    }

    /*2. Задан целочисленный список ArrayList.
    Найти минимальное, максимальное и среднее арифметическое из этого списка. Collections.max()*/
    static void ex2(int num, int max){
        System.out.println("Ex 2");

        List<Integer> list = new ArrayList<>();
        randomIntList(list, num, max);

        int count = 0, summ = 0;
        for (Integer integer : list) {
            summ += integer;
            count++;
        }

        double result = (double) summ / count;

        System.out.println("Минимум: " + Collections.min(list));
        System.out.println("Максимум: " + Collections.max(list));
        System.out.println("Среднее арифметическое: " + result);
        System.out.println();
    }

    private static List<Integer> randomIntList(List<Integer> list, int num, int max) {
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            list.add(random.nextInt(max));
        }

        System.out.println(list);
        return list;
    }
}
