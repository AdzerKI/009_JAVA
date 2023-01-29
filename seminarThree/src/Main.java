import java.util.*;
import java.util.random.RandomGenerator;

public class Main {

    public static void main(String[] args) {


        //ex1(10);
        //ex2();
        ex3();

    }

    static void ex1(int num){
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(random.nextInt(num));
        }

        System.out.println(list);
        System.out.println();

        /*Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });*/
        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);
    }

    static void ex2(){
        List list = new ArrayList();
        list.add(55);
        list.add(76);
        list.add("Hi");
        list.add("bb");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }

        System.out.println(list);
    }

    static void ex3(){
        List<List<String>> list = new ArrayList<>();
        addBook(list, "Детектив", "Шерлок Холмс");
        addBook(list, "Ужасы", "ОНО");
        addBook(list, "Ужасы", "ОНО 2");

        System.out.println(list);
    }

    static void addBook(List<List<String>> list, String genre, String bookName){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(0).equals(genre)){
                list.get(i).add(bookName);
                return;
            }
        }

        List<String> list1 = new ArrayList<>();
        list1.add(genre);
        list1.add(bookName);

        list.add(list1);
    }

}
