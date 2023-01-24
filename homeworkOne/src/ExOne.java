public class ExOne {

   /* 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)*/

    static int solution(int num) {
        // сумматор
        int result = 0;

        // Вычисляем результат
        for (int i = 1; i <= num; i++) {
            result += i;
        }

        return result;
    }

}
