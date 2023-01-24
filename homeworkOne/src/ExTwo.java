public class ExTwo {

    /*2. Вычислить n! (произведение чисел от 1 до n)*/
    static int solution(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return result;
    }
}
