import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println(ex1());

        System.out.println(ex2("Иван Иванов, Светлана Петрова, " +
                "Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, " +
                "Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, " +
                "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов."));

    }

    static HashMap<String, List<Long>> ex1(){
        /*Реализуйте структуру телефонной книги с помощью HashMap,
                учитывая, что 1 человек может иметь несколько телефонов.*/
        HashMap<String, List<Long>> hashMap = new HashMap<>();
        List<Long> list = new ArrayList<>();
        List<Long> list2 = new ArrayList<>();
        list.add(891919199L);
        list.add(823413499L);
        list.add(23423499L);
        list2.add(8913242349L);
        list2.add(23433399L);
        hashMap.put("Иванов", list);
        hashMap.put("Сидоров", list2);
        return hashMap;

    }

    static TreeMap<String, Integer> ex2(String s){
        /*   Пусть дан список сотрудников: ...
         Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.
        */

        // Получаем массив "Имя Фамилия"
        s = s.replace(".", "");
        String[] fullName = s.split(", ");

        // Получаем список "Имя"
        List<String> names = new ArrayList<>();
        for (String value : fullName) {
            String[] fullNameSplit = value.split(" ");
            names.add(fullNameSplit[0]);
        }

        // Записываем в treeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        for (String name: names) {
            if (treeMap.containsKey(name)){
                int count = treeMap.get(name) + 1;
                treeMap.replace(name, count);
            } else {
                treeMap.put(name, 1);
            }
        }

        return sortByValues(treeMap);
    }

    // это было загуглено, не знал как в TreeMap отсортировать
    public static <K, V extends Comparable<V>> TreeMap<K, V> sortByValues(final TreeMap<K, V> map) {
        Comparator<K> valueComparator =  new Comparator<K>() {
            public int compare(K k1, K k2) {
                int compare = map.get(k2).compareTo(map.get(k1));
                if (compare == 0) return 1;
                else return compare;
            }
        };
        TreeMap<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;
    }
}
