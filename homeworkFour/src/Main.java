import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    static void ex1(){
        /*
        1. Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
        */
        int[] array = new int[]{4,5,3,2,4,1};
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int j : array) {
            linkedList.add(j);
        }
        System.out.println(linkedList);

        LinkedList<Integer> newLinkedList = new LinkedList<>();
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            newLinkedList.add(linkedList.get(i));
        }
        System.out.println(newLinkedList);
    }

    static void ex2() {
        /*2.
        Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
        */
        int[] array = new int[]{4,5,3,2,4,1};
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int j : array) {
            linkedList.add(j);
        }

        System.out.println(linkedList);
        enqueue(linkedList, 5);
        System.out.println(linkedList);
        dequeue(linkedList);
        System.out.println(linkedList);
        first(linkedList);
        System.out.println(linkedList);

    }


    static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList, int num) {
        linkedList.add(num);
        return linkedList;
    }

    static LinkedList<Integer> dequeue(LinkedList<Integer> linkedList) {
        System.out.println(linkedList.get(0));
        linkedList.remove(0);
        return linkedList;
    }

    static LinkedList<Integer> first(LinkedList<Integer> linkedList) {
        System.out.println(linkedList.get(0));
        return linkedList;
    }

    static void ex3(){
        /*3. Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор*/
        int[] array = new int[]{4,5,3,2,4,1};
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int j : array) {
            linkedList.add(j);
        }

        int summ = 0;
        for (int j : linkedList) {
            summ += linkedList.get(j);
        }
        System.out.println(summ);

    }
}
