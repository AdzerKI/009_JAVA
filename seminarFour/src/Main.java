import java.util.*;

public class Main {

    public static void main(String[] args) {
        //ex0(100000);
        //ex1();
        ex4();
    }

    static void ex0(int num){
        /*
        1) замерьте время за которое ArrayList добавляет 10000 элементов
        2) замерьте время за которое LinkedList добавляет 10000 элементов
         */
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            // добавление в конец и чтение лучше ArrayList
            arrayList.add(5);

            // добавление в начало лучше linkedList
            //arrayList.add(0, 5);
        }
        long finishTime = System.currentTimeMillis();
        System.out.println("ArrayList: " + (finishTime - startTime));

        LinkedList<Integer> linkedList = new LinkedList<>();
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            // добавление в конец и чтение лучше ArrayList
            //linkedList.add(5);

            // добавление в начало лучше linkedList
            linkedList.add(0, 5);
        }
        long finishTime2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (finishTime2 - startTime2));
    }

    static void ex1(){
        /*
        Реализовать консольное приложение, которое:
        Принимает от пользователя строку вида
        text~num
        Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
                Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.*/

        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> linkedList = new LinkedList<>();

        while (work) {
            String line = scanner.nextLine();
            String[] lines = line.split("~");

            if (lines[0].equals("print")) {
                int index = Integer.parseInt(lines[1]);
                String word = linkedList.get(index);
                System.out.println(word);
                linkedList.remove(index);
                work = false;
            } else {
                if (!lines[1].matches("[0-9]+")) {
                    System.out.println("Введена неверная команда \\d");
                    continue;
                }

                int index = Integer.parseInt(lines[1]);
                if (index > linkedList.size()){
                    System.out.println("Введена неверная команда");
                    continue;
                }

                linkedList.add(index, lines[0]);
            }
        }
    }

    static void ex2(){
        /*Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так,
        чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.*/
    }

    static void ex3(){
        int[] array = new int[]{4,5,3,2,4,1};

        /*1) Написать метод, который принимает массив элементов,
                помещает их в стэк и выводит на консоль содержимое стэка. */
        Stack<Integer> stack = new Stack<>();
        for (int j : array) {
            stack.push(j);
        }
        // вывестьи последний и удалить
        System.out.println(stack.pop());
        System.out.println(stack);

        /*2) Написать метод, который принимает массив элементов,
                помещает их в очередь и выводит на консоль содержимое очереди.*/
        Queue<Integer> queue = new ArrayDeque<>();
        for (int j : array) {
            queue.add(j);
        }
        // вывестьи первый и удалить
        System.out.println(queue.poll());
        System.out.println(queue);

    }

    static void ex4(){
        /*Реализовать стэк с помощью массива.
                Нужно реализовать методы:
        size(), empty(), push(), peek(), pop().*/
        MyStack myStack = new MyStack(4);
        System.out.println(myStack.size());
        myStack.push(4);
        myStack.push(3);
        myStack.push(6);
        myStack.push(4);
        myStack.push(3);
        myStack.push(6);
        myStack.push(4);
        myStack.push(3);
        myStack.push(6);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());

    }
}
