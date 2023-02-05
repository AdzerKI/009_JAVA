import com.sun.source.tree.BreakTree;

public class MyStack {

    private int[] array;
    private int size;

    MyStack(int capacity){
        array = new int[capacity];
    }

    // размер массива
    int size(){
        return size;
    }

    // проверка на пустоту
    boolean empty(){
        return size == 0;
    }

    // добавляем
    void push(int element){
        if (array.length <= size){
            int[] array2 = new int[array.length + 10];
            System.arraycopy(array, 0, array2, 0, array.length);
            array = array2;
        }

        array[size] = element;
        size++;
    }

    // показывает последний
    int peek(){
        return array[size-1];
    }

    // показывает последний и удаляет
    int pop(){
        int val = array[size-1];
        size--;
        return val;
    }
}
